<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Введите свои данные</h2>
<br>
<form:form action = "show" modelAttribute="personSpecification">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>

    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>

    Date of Birth: <form:input path="dateOfBirth"/>
    <form:errors path="dateOfBirth"/>
    <br><br>

    Your sex: <form:radiobuttons path="sex" items="${personSpecification.sex_s}"/>
    <form:errors path="sex"/>
    <br><br>

    Phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    Job <form:input path="job"/>
    <form:errors path="job"/>
    <br><br>

    Age <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>

    You car(s) <form:checkboxes path="car" items="${personSpecification.cars}"/>
    <br><br>

    Do you have apartment?
    <form:select path="apartment">
        <form:options items="${personSpecification.apartments}"/>
    </form:select>
    <br><br>

    Do you have pet(s)?
    <form:radiobuttons path="pet" items="${personSpecification.pets}"/>
    <br><br>

    Foreing Language(s):
    <br>
    <form:checkboxes path="language" items="${personSpecification.languages}"/>
    <br><br>

    Salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>
</body>
</html>