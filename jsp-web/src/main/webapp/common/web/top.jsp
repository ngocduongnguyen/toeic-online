<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglib.jsp"%>
<html>
<head>
    <title>Top</title>
</head>
<body>
<!--HEADER ROW-->
<div id="header-row">
    <div class="container">
        <div class="row">
            <!--LOGO-->
            <div class="span3"><a class="brand" href="/home.html"><h1>Trang chủ</h1></a></div>
            <!-- /LOGO -->

            <!-- MAIN NAVIGATION -->
            <div class="span9">
                <div class="navbar  pull-right">
                    <div class="navbar-inner">
                        <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span
                                class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a>
                        <div class="nav-collapse collapse navbar-responsive-collapse">
                            <ul class="nav">

                                <%--<li class="dropdown">--%>
                                    <%--<a href="about.html" class="dropdown-toggle" data-toggle="dropdown">About <b--%>
                                            <%--class="caret"></b></a>--%>
                                    <%--<ul class="dropdown-menu">--%>
                                        <%--<li><a href="about.html">Company</a></li>--%>
                                        <%--<li><a href="about.html">History</a></li>--%>
                                        <%--<li><a href="about.html">Team</a></li>--%>
                                    <%--</ul>--%>

                                <%--</li>--%>

                                <li><a href="<c:url value="login.html"/>">Đăng nhập</a></li>
                                <li><a href="service.html">Tài khoản[fullname]</a></li>
                                <li><a href="service.html">Đăng xuất</a></li>
                                <li><a href="blog.html">Blog</a></li>
                                <li><a href="contact.html">Contact</a></li>

                            </ul>
                        </div>

                    </div>
                </div>
            </div>
            <!-- MAIN NAVIGATION -->
        </div>
    </div>
</div>
<!-- /HEADER ROW -->
</body>
</html>
