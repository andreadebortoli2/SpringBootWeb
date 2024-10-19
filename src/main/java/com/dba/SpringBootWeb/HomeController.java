package com.dba.SpringBootWeb;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    // SERVLET WAY + with session
    // @GetMapping("add")
    // public String add(HttpServletRequest req, HttpSession session) {

    // int num1 = Integer.parseInt(req.getParameter("num1"));
    // int num2 = Integer.parseInt(req.getParameter("num2"));

    // int result = num1 + num2;

    // put data in the session
    // session.setAttribute("result", result);

    // return "result.jsp";
    // }

    // SPRING BOOT version with model object instead of http session
    // @GetMapping("add")
    // public String add(@RequestParam int num1, @RequestParam int num2, Model
    // model) {

    // int result = num1 + num2;

    // model.addAttribute("result", result);

    // return "result";
    // }

    // version with model view object
    @GetMapping("add")
    public ModelAndView add(@RequestParam int num1, @RequestParam int num2, ModelAndView mv) {

        int result = num1 + num2;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

}
