<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/10/2022
  Time: 4:04 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="cal" method="post">
    <input type="number" name="a" placeholder="Input value a" >
    <input type="number" name="b" placeholder="Input value b" > <br>
    <input type="submit" name="submit" value="add">
    <input type="submit" name="submit" value="sub">
    <input type="submit" name="submit" value="mul">
    <input type="submit" name="submit" value="div">
</form>
<p>Result : ${result}</p>
</body>
</html>
