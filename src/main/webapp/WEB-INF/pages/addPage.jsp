<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление студента</title>
</head>
<body>

<form:form method="POST" action="/add" modelAttribute="student">
    <form:hidden path="id" />
    <table>
        <tr>
            <td>Name:</td>
            <td ><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Sure name:</td>
            <td><form:input path="surename" /></td>
        </tr>
        <tr>
            <td>Date:</td>
            <td><form:input path="date" /></td>
        </tr>
        <tr>
            <td>Number phone:</td>
            <td><form:input path="number" /></td>
        </tr>
        <tr>
            <td>Course number:</td>
            <td><form:input path="course" /></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><form:input path="gender"/></td>
        </tr>
        <tr>
            <td>Payskin:</td>
            <td><form:input path="payskin"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>