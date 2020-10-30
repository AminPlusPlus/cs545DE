<%--
  Created by IntelliJ IDEA.
  User: aminjoniabdullozoda
  Date: 10/26/20
  Time: 10:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Result</title>
</head>
<body>
<form action="calculator_res" method="post">
    <input type = "text" id="add1" name = "add1" size = "2"  value = "${result.add1}" />+
    <input type = "text" id="add2" name = "add2" value = "${result.add2}" size = "2"/>=
    <input type = "text" id="sum" name = "sum" value = "${result.sum()}"  size = "2" readonly/><br/>
    <input type = "text" id="mult1" name = "mult1" value = "${result.mult1}" size = "2"/>*
    <input type = "text" id="mult2" name = "mult2" value = "${result.mult2}"  size = "2"/>=
    <input type = "text" name = "product" value = "${result.product()}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>
</form>
</body>
</html>
