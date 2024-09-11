<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Room Information</title>
</head>
<body>
    <h1>Room Information</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>City Name</th>
                <th>Area Name</th>
                <th>Room Type</th>
                <th>Deposit</th>
                <th>Rent</th>
                <th>Contact</th>
                <th>Other Info</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="room : ${roomsList}">
                <td th:text="${room.id}"></td>
                <td th:text="${room.cityName}"></td>
                <td th:text="${room.areaName}"></td>
                <td th:text="${room.roomType}"></td>
                <td th:text="${room.deposit}"></td>
                <td th:text="${room.rent}"></td>
                <td th:text="${room.contact}"></td>
                <td th:text="${room.description}"></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
