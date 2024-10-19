<%@page language="java" %>

    <html>

    <head>
        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <h2>Hello World! Calculator</h2>

        <form action="add">
            <label for="num1">Enter 1st Number:</label>
            <input type="text" name="num1" id="num1">
            <label for="num2">Enter 2nd Number:</label>
            <input type="text" name="num2" id="num2">
            <input type="submit" value="Submit">
        </form>

        <h2>Add User</h2>
        <form action="addUser">
            <label for="userId">User ID</label>
            <input type="text" name="userId" id="userId">
            <label for="username">Username</label>
            <input type="text" name="username" id="username">
            <input type="submit" value="Add">
        </form>
    </body>

    </html>