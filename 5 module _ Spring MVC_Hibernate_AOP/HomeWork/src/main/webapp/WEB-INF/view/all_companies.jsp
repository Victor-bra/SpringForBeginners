<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Companies</title>
</head>
<body>

<h2>List of companies</h2>
<br><br>
<table>
    <tr>
        <th>ID</th>
        <th>Company name</th>
        <th>Director name</th>
        <th>Director surname</th>
        <th>Amount of workers</th>
        <th>Number of department</th>
        <th>Alternate name</th>
        <th>Notes</th>
        <th>Other</th>
    </tr>
    <c:forEach var="comp" items="${allCompaniesList}">
        <c:url var = "updateButton" value="/updateComp">
            <c:param name="compId" value="${comp.id}"/>
        </c:url>
        <c:url var = "deleteButton" value="/deleteComp">
            <c:param name="compId" value="${comp.id}"/>
        </c:url>

        <tr>
            <td>${comp.id}</td>
            <td>${comp.companyName}</td>
            <td>${comp.directorName}</td>
            <td>${comp.directorSurname}</td>
            <td>${comp.amountOfWorkers}</td>
            <td>${comp.numberOfDepartment}</td>
            <td>${comp.alternateName}</td>
            <td>${comp.notes}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br><br>
<input type="button" value="add" onclick="window.location.href='add_update'"/>
</body>
</html>
