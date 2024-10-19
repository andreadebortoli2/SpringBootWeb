<%@page language="java" %>

    <html>

    <head>
        <link rel="stylesheet" href="./../assets/css/style.css">
    </head>

    <body>

        <!-- standard JSP -->
        <!-- <h2>
            Result is : <%= session.getAttribute("result") %>
        </h2> -->

        <!-- JSTL way part of JSP std lib -->
        <h2>
            Result is : ${result}
        </h2>

    </body>

    </html>