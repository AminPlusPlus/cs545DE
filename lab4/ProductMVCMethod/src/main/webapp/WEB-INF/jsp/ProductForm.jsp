 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(resources/main.css);</style>
</head>
<body>

<div id="global">
<form:form modelAttribute="product" action="product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
            <label >Category </label>
            <form:select path="category.name" itemLabel="name" itemValue="id" items = "${categories}"></form:select>

        </p>
         
        <p>
            <label for="name">Product Name: </label>
            <form:input path="name"></form:input>

        </p>
        <p>
            <label for="description">Description: </label>
            <form:input path="description"></form:input>

        </p>
        <p>
            <label for="price">Price: </label>
            <form:input path="price"></form:input>
        </p>
        <p id="buttons">
             <input id="submit" type="submit" value="Add Product">
    </fieldset>
</form:form>
</div>
</body>
</html>
