<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
    <title><dec:title default="Admin"></dec:title></title>
    <link href="<c:url value="/teamplate/admin/vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/teamplate/admin/vendor/datatables/dataTables.bootstrap4.css"/>" rel="stylesheet">
    <link href="<c:url value="/teamplate/admin/css/sb-admin.css"/>" rel="stylesheet">
</head>
<body id="page-top">

<%--TOP--%>
<%@ include file="/common/admin/top.jsp"%>
<div id="wrapper">
    <!-- Sidebar -->
    <%@ include file="/common/admin/menu.jsp"%>
    <div id="content-wrapper">

        <dec:body></dec:body>

        <!-- Footer -->
        <%@ include file="/common/admin/footer.jsp"%>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="<c:url value="/teamplate/admin/vendor/jquery/jquery.min.js"/>"></script>
<script src="<c:url value="/teamplate/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/teamplate/admin/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
<script src="<c:url value="/teamplate/admin/vendor/chart.js/Chart.min.js"/>"></script>
<script src="<c:url value="/teamplate/admin/vendor/datatables/jquery.dataTables.js"/>"></script>
<script src="<c:url value="/teamplate/admin/vendor/datatables/dataTables.bootstrap4.js"/>"></script>
<script src="<c:url value="/teamplate/admin/js/sb-admin.min.js"/>"></script>
<script src="<c:url value="/teamplate/admin/js/demo/datatables-demo.js"/>"></script>
<script src="<c:url value="/teamplate/admin/js/demo/chart-area-demo.js"/>"></script>
</body>
</html>
