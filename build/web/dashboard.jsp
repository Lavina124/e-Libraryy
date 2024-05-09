<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>E-Library Management Dashboard</title>
<style>
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
  }
  
  nav h1 {
    margin: 0;
  }
  
    .container {
        width: 80%;
        margin: 50px auto;
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
    .dash h1{
        color: white;
    }
</style>
</head>
<body>
    <nav>
        <h1><center>E-Library Management</center></h1>
      </nav>
    
<div class="container">
    <div class="rectangle">
        <a href="addbook.jsp" class="button">Add Book</a>
        <a href="search.jsp" class="button">Search Book</a>
        <a href="bookup.jsp" class="button">Update Book</a>
        <a href="bookor.jsp" class="button">View Order</a>
        <a href="signout.jsp" class="button">Sign Out</a>
    </div>
</div>
    <div class="dash">
        <h1><center>WELCOME ADMIN</center></h1></div>
</body>
</html>
