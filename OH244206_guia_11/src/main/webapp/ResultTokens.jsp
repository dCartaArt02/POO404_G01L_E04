<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/14/2024
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>c:forTokens Demo</title>
</head>
<body>
<div class="container">
    <div class="row">
        &nbsp;
    </div>
    <div class="panel panel-primary">
        <div class="panel-heading">Your tokens</div>
        <div class="panel-body">
            <c:forTokens items="${param.delimText}" delims="${param.delim}" var="myToken">
                <p><c:out value="${myToken}"/></p>
            </c:forTokens>
        </div>
    </div>
</div>
</body>
</html>
