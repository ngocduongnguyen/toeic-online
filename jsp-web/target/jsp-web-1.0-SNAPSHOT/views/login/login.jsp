<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Đăng nhập</title>
    <c:url var="urlLogin" value="/login.html"/>
</head>
<body class="bg-dark">
<div class="container">
    <div class="card card-login mx-auto mt-5">
        <div class="card-header">Đăng nhập</div>
        <div class="card-body">
            <form method="post" action="${urlLogin}">
                <%--thông báo lỗi--%>
                <c:if test="${not empty param.alert}">
                    <a class="btn btn-${param.alert}">${param.message}</a>
                    <div style="margin-bottom: 15px"></div>
                </c:if>
                <%--end thông báo lỗi--%>
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" name="pojo.name" id="inputEmail" class="form-control" placeholder="Email address" required="required" autofocus="autofocus">
                        <label for="inputEmail">Username</label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="password" name="pojo.password" id="inputPassword" class="form-control" placeholder="Password" required="required">
                        <label for="inputPassword">Password</label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me">
                            Remember Password
                        </label>
                    </div>
                </div>
                <%--<a class="btn btn-primary btn-block" href="index.html">Login</a>--%>
                <button class="btn btn-primary btn-block" type="submit" name="btnLogin">Login</button>
            </form>
            <div class="text-center">
                <a class="d-block small mt-3" href="register.html">Register an Account</a>
                <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
