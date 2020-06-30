<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        .dark {background-color: black}
        .color {color: blueviolet}
    </style>
</head>
<body>

<div id="wrapper">
    <div id=header">
<h2 class="color">CRM-Customer Relationship Manager</h2>
</div>
</div>
<br><br>
<div id="container">
    <div id="content">

        <a href="save">Add kusztomer</a>
<br><br>
<table style="width:100%">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
    <tr>
        <td>${customer.firstName}</td>
        <td>${customer.lastName}</td>
        <td>${customer.email}</td>
    </tr>
    </c:forEach>
    <tr>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>

    </div>
</div>


</body>
</html>