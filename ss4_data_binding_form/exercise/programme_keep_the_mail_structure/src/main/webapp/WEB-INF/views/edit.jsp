<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="email"  action="/email/edit" method="post">
    <h1>Settings</h1>
    <table>
        <form:hidden path="id"/>
        <tr>
            <td><form:label path="language">Language:</form:label></td>
            <td>
                <form:select path="language" items="${languageList}"/>
            </td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size:</form:label></td>
            <td>
                Show <form:select path="pageSize" items="${sizeList}"></form:select> email per page
            </td>
        </tr>
        <tr>
            <td><form:label path="spamsFilter">Spams Filter:</form:label></td>
            <td>
                <form:checkbox path="spamsFilter" value="Enable spams filter"></form:checkbox>Enable spams filter
            </td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature:</form:label></td>
            <td>
                <form:input path="signature"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update">
            </td>
            <td>
                <a href="/email/list"><input type="button" value="Cancel"></a>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>