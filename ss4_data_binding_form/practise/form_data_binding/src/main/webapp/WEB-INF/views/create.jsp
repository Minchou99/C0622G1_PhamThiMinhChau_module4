<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/10/2022
  Time: 10:16 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="post" action="/employee/create" modelAttribute="employee">
    <table>
        <tr>
            <td>ID:</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>Employee's Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Contact's number:</td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
