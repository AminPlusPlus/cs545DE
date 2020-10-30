<%--
  Created by IntelliJ IDEA.
  User: aminjoniabdullozoda
  Date: 10/26/20
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<div id="global">
<c:if test="${errors != null}">

    <p id="errors">
        Error(s)!
    <ul>
        <c:forEach var="error" items="${errors}">
            <li>${error}</li>
        </c:forEach>
    </ul>


</c:if>
<form action="calculator_res" method="post">
    <input type = "text" id="add1" name = "add1" size = "2"  value = "${form.add1}" />+
    <input type = "text" id="add2" name = "add2" value = "${form.add2}" size = "2"/>=
    <input type = "text" id="sum" name = "sum" value = ""  size = "2" readonly/><br/>
    <input type = "text" id="mult1" name = "mult1" value = "${form.mult1}" size = "2"/>*
    <input type = "text" id="mult2" name = "mult2" value = "${form.mult2}"  size = "2"/>=
    <input type = "text" name = "product" value = ""   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>
</form>
</div>
</body>
</html>
