<%--
  Created by IntelliJ IDEA.
  User: aminjoniabdullozoda
  Date: 10/25/20
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ask for advice about your favorite roast:</title>
</head>
<body>
<form action="../action/login" method="get">
<h2>Starbuck's  ${roast.toUpperCase()} Roast Coffees: </h2>
    <table>

        <c:forEach var = "item" items = "${adviceList}">
            <tr style="background-color:yellow">
            <td> ${item} </td>
            </tr>
        </c:forEach>

    </table>
    <input type="submit" value="Back">
</form>
</body>
</html>
