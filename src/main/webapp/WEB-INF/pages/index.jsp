<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/reset.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/css/structure.css"/> " rel="stylesheet" type="text/css">
    <title>Home Page</title>
</head>
<body>
<label class="boxBody">Welcome into MySmartHomePage</label>
<form class="box login" method="post" action="login">
    <fieldset class="boxBody">
        <label>Username</label>
        <input type="text" name="login" tabindex="1" placeholder="login" required>
        <label>Password</label>
        <input type="password" name="password" tabindex="2" placeholder="password" required>
    </fieldset>
    <footer>
        <label><input type="checkbox" tabindex="3">Keep me logged in</label>
        <input type="submit" class="btnLogin" value="Login" tabindex="4">
    </footer>
</form>
<footer id="main">
    <a href="http://wwww.cssjunction.com">Login Form (HTML5/CSS3 Coded)</a> | <a href="http://www.premiumpixels.com">PSD by Premium Pixels</a>
</footer>
</body>
</html>
