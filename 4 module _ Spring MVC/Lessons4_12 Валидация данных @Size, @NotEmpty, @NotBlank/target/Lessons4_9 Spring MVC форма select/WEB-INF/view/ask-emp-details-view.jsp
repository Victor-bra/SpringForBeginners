<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>
<br>
<form:form action = "showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <%--<form:option value="Information Technoligy" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>
    </form:select>--%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>

</html>