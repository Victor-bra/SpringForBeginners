<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<body>

<h2>Dear Employee, you are WELCOME!!!</h2>
<br>
Your name: ${personSpecification.name}
<br>
Your birthday: ${personSpecification.dateOfBirth}
<br>
Your sex: ${personSpecification.sex}
<br>
Your phone number: ${personSpecification.phoneNumber}
<br>
Your email: ${personSpecification.email}
<br>
Your job: ${personSpecification.job}
<br>
Your age: ${personSpecification.age}
<br>
Your car:
<ul>
    <c:forEach var="crs" items="${personSpecification.car}">
        <li>${crs}</li>
    </c:forEach>
</ul>
<br>
Your apartment: ${personSpecification.apartment}
<br>
Have pet(s): ${personSpecification.pet}
<br>
Language(s):
<ul>
    <c:forEach var="lan" items="${personSpecification.language}">
        <li>${lan}</li>
    </c:forEach>
</ul>
<br>
Salary: ${personSpecification.salary}
</body>

</html>