
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Enter Student Information</h2>

    <form action="studentResult.jsp" method="post">
        Name: <input type="text" name="name" required><br><br>
        Roll Number: <input type="text" name="roll" required><br><br>
        Course: <input type="text" name="course" required><br><br>
        Age: <input type="number" name="age" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
