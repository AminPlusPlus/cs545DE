<%--
  Created by IntelliJ IDEA.
  User: aminjoniabdullozoda
  Date: 10/25/20
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice" method="get">
    <select name="roast" >
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/><br/>
    <input type="submit" value = "Submit" />
</form>
<div id='advice'>

</div>
<p />
</body>
</html>
