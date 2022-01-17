<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>For employee</title>
</head>
<body>

<h3>Information for employee</h3>

<br><br>

<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary" onclick="window.location.href='hr_info'"/> Only for HR staff
</security:authorize>

<br><br>

<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance" onclick="window.location.href='manage_info'"/> Only for managers
</security:authorize>

<br><br>

</body>
</html>