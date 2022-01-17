<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add(Update) company</title>
</head>
<body>

<h2>Company info</h2>

<form:form action="/saveCompanyInfo" modelAttribute="company">

    <form:hidden path="id"/>

    Company name <form:input path="companyName"/>
    <form:errors path="companyName"/>
    <br><br>
    Director name <form:input path="directorName"/>
    <br><br>
    Director surname <form:input path="directorSurname"/>
    <br><br>
    Amount of workers <form:input path="amountOfWorkers"/>
    <br><br>
    Number of departments <form:input path="numberOfDepartment"/>
    <br><br>
    Alternate name <form:input path="alternateName"/>
    <br><br>
    Notes:<br>
        <form:textarea path="notes" rows="6" cols="50"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>
</body>
</html>
