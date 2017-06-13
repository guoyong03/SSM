<%--
  Created by IntelliJ IDEA.
  User: guoyong03
  Date: 2017/5/29
  Time: 下午9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Show Page22</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="10">
  <tr>
    <th>ID</th>
    <th>LastName</th>
    <th>Email</th>
  </tr>

  <c:forEach items="${requestScope.employees}" var="emp">
    <tr>
      <th>${emp.id}</th>
      <th>${emp.lastName}</th>
      <th>${emp.email}</th>
    </tr>
  </c:forEach>
</table>
</body>
</html>
