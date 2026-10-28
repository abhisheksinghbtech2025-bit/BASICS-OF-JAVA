
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>
    <h2>Registration Successful!</h2>

    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
    %>

    <p>Name: <%= name %></p>
    <p>Email: <%= email %></p>
    <p>Phone Number: <%= phone %></p>
    <p>Password: Submitted successfully (not displayed)</p>

    <a href="register.jsp">Back to Registration</a>
</body>
</html>
