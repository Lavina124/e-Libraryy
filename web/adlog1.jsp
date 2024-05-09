<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%
    // Retrieve username and password from the request parameters
    String enteredUsername = request.getParameter("username");
    String enteredPassword = request.getParameter("password");

    // Database connection details
    String url = "jdbc:mysql://localhost:3306/lib";
    String dbUsername = "root";
    String dbPassword = "123456789";

    // Attempt to authenticate the admin
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
        PreparedStatement ps = con.prepareStatement("SELECT * FROM admin_login WHERE username=? AND password=?");
        ps.setString(1, enteredUsername);
        ps.setString(2, enteredPassword);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            // Admin authenticated, redirect to dashboard or another page
            HttpSession adminSession = request.getSession();
            adminSession.setAttribute("username", enteredUsername); // Store username in session for future use
            response.sendRedirect("dashboard.jsp");
        } else {
            // Authentication failed, display error message
            out.println("<p>Login failed. Please check your username and password.</p>");
        }
        con.close();
    } catch (Exception e) {
        out.println("<p>An error occurred: " + e.getMessage() + "</p>");
    }
%>
