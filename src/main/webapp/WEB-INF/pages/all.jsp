<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная </title>
    <style>
        <%@include file="/resources/css/style.css"%>
    </style>
</head>
<body>
<table>
    <tr>
        <td><b>ID</b></td>
        <td><b >Name </b></td>
        <td><b>Sure name</b></td>
        <td><b>Date</b></td>
        <td><b>Number</b></td>
        <td><b>Course</b></td>
        <td><b>Gender</b></td>
        <td><b>Pay skin</b></td>
    </tr>
    <c:forEach var="student" items="${students}">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.surename}</td>
        <td>${student.date}</td>
        <td>${student.number}</td>
        <td>${student.course}</td>
        <td>${student.gender}</td>
        <td>${student.payskin}</td>
        <td><a href="/edit?id=${student.id}">Edit</a> | <a href="/delete?id=${student.id}">Delete</a> </td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="/add">Добавить запись</a>
        </td>
    </tr>
</table>
</body>
</html>
