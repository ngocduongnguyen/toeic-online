<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <title><dec:title default="Trang chủ"></dec:title></title>
    <link href="<c:url value="/teamplate/web/css/bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/teamplate/web/css/bootstrap-responsive.css"/>" rel="stylesheet">
    <link href="<c:url value="/teamplate/web/css/style.css"/>" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600' rel='stylesheet'
          type='text/css'>
</head>
<body>
<%@include file="/common/web/top.jsp" %>
<div class="container">
    <div class="row">
        <dec:body></dec:body>
    </div>
</div>
<%@include file="/common/web/footer.jsp" %>
<%--<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>--%>
<script src="<c:url value="/teamplate/web/js/jquery.js"/>"></script>
<script src="<c:url value="/teamplate/web/js/bootstrap.min.js"/>"></script>
</body>
</html>