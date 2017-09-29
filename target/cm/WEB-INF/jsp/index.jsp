<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h1>SSM personal website</h1>
<div>
    <form action="/signin" method="post">
        <input type="text" name="username" placeholder="Username"><br>
        <input type="text" name="password" placeholder="Password"><br>
        <input type="submit" value="Sign In">
    </form>

    <form action="/signup" method="get">
        <input type="submit" value="Sign Up">
    </form>
</div>
</body>
</html>