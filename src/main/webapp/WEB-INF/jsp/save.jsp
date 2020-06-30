<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<h1 class="color">CRM-Customer Relationship Manager</h1>
<br><br>
<form:form action="processForm" modelAttribute="save">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Email: <form:input path="email"/>
    <br><br>
    <input type="submit" value="Save Customer"/>
    <br><br>
    <a href="home" >Go back</a>
</form:form>


</body>
</html>