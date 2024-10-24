<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/14/2024
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
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
    <div class="col-sm-4 col-sm-offset-4">
      <div class="row">
        <h3>c:forTokens Demo</h3>
      </div>
      <form role="form" name="forTokensForm" action="ResultTokens.jsp" method="POST">
        <div class="form-group">
          <label for="delimText">Enter some text with delimiter:</label>
          <input type="text" class="form-control" name="delimText" id="delimText">
        </div>
        <div class="form-group">
          <label for="delim">Enter the delimiter:</label>
          <input type="text" class="form-control" id="delim" name="delim">
        </div>
        <input type="submit" class="btn btn-info" value="Tokenize">
      </form>
    </div>
  </div>
</div>
<a href="principal.jsp">eeee</a>
</body>
</html>