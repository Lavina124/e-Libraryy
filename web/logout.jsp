<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Out</title>
    <style>
      * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}
body {
font-family: Arial, sans-serif;
margin: 0;
padding: 0;
background-color: #f2f2f2;
background-image: url(index.jpg);
background-repeat: no-repeat;
background-size: cover;
}

nav {
background-color: #333;
color: #fff;
padding: 10px;
margin: 0;
text-align: center;
}

nav h1 {
margin: 0;
}
.container {
width: 80%; 
    margin: 55px auto;
}
.rectangle {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: #325b33;
    border: 2px solid #ccc;
    padding: 20px;
    border-radius: 28px;
   
}
.button {
    padding: 10px 20px;
    background-color: #0f2d11;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    text-decoration: none;
}
.button:hover {
    background-color: #4fdc62;
}
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            text-align: center;
        }
       
        .sign-out-button {
            background-color: #0f2d11;
            color: #fff;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin-top: 20px;
            cursor: pointer;
        }
        .sign-out-button:hover {
            background-color: #4fdc62;
        }
        .logo {
            width: 100px;
            height: 100px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
   <nav>
        <h1><center>E-Library Management</center></h1>
    </nav>
     <div class="container">
        <div class="rectangle">
        <a href="booksrh.jsp" class="button">Book search</a>
        <a href="view.jsp" class="button">View Data info</a>
        <a href="return.jsp" class="button">Return book</a>
        <a href="place.jsp" class="button">Place order</a>
        <a href="logout.jsp" class="button">Logout      </a>
    </div>
</div>
    <div class="container">
         <form action="home.jsp" method="post">
        <img src="signo.jpeg" alt="Logo" class="logo">
        
        
            <button type="submit" class="sign-out-button">Log Out</button>
        </form>
    </div>

    
    
</body>
</html>
