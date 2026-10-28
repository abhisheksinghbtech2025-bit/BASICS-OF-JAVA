
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result</title>
</head>
<body>
    <h2>Student Information</h2>

    <%
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String course = request.getParameter("course");
        String age = request.getParameter("age");
    %>

    <p>Name: <%= name %></p>
    <p>Roll Number: <%= roll %></p>
    <p>Course: <%= course %></p>
    <p>Age: <%= age %></p>
</body>
</html>
