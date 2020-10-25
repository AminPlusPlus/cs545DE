<%--
  Created by IntelliJ IDEA.
  User: aminjoniabdullozoda
  Date: 10/25/20
  Time: 12:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Result</h1>
<form action="calc2" method="get">
    <input type = "text" name = "add1" size = "2"  value = "${param.add1}" />+
    <input type = "text" name = "add2" value = "${add2}" size = "2"/>=
    <input type = "text" name = "sum" value = "${sum}"  size = "4" readonly/><br/>
    <input type = "text" name = "mult1" value = "${mult1}" size = "2"/>*
    <input type = "text" name = "mult2" value = "${mult2}"  size = "2"/>=
    <input type = "text" name = "product" value = "${product}"   size = "4" readonly/><br/>
    <input type = "submit" value = "Submit"/>
</form>
</body>
</html>
