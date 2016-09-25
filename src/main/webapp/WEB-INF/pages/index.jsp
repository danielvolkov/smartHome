<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/loginpage.css"/> " rel="stylesheet" type="text/css">
    <title>Home Page</title>
</head>
<body>
<div class="container">

    <div class="row" id="pwd-container">
        <div class="col-md-4"></div>

        <div class="col-md-4">
            <section class="login-form">
                <form method="post" action="#" role="login">

                    <input type="email" name="email" placeholder="Email" required class="form-control input-lg" value="joestudent@gmail.com" />

                    <input type="password" class="form-control input-lg" id="password" placeholder="Password" required="" />


                    <div class="pwstrength_viewport_progress"></div>


                    <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Sign in</button>
                    <div>
                        <a href="#">Create account</a> or <a href="#">reset password</a>
                    </div>

                </form>

                <div class="form-links">
                    <a href="#">www.website.com</a>
                </div>
            </section>
        </div>

        <div class="col-md-4"></div>


    </div>

    <p>
        <a href="http://validator.w3.org/check?uri=http%3A%2F%2Fbootsnipp.com%2Fiframe%2FW00op" target="_blank"><small>HTML</small><sup>5</sup></a>
        <br>
        <br>

    </p>

</div>
</body>
</html>
