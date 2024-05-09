<!-- This is admin section -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AdminLogin</title>
    
</head>
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
    text-align: center;
  }
  
  nav h1 {
    margin: 0;
  }

  .container {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 333px;
    padding: 59px;
    background-color: #2f5834;
    border: 1px solid #2d2929;
    border-radius: 6px;
  }
  
  .container h2 {
    margin-top: 0;
    margin-bottom: 20px;
    text-align: center;
  }
  
  .container label {
    display: block;
    margin-bottom: 5px;
  }
  
  .container input[type="text"],
  .container input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
  }
  
  .container input[type="submit"] {
    width: 80%;
    padding: 10px;
    background-color: #4CAF50;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    align-items: center;
  }
  
  .container input[type="submit"]:hover {
    background-color: #45a049;
  }
</style>
<body>
    <nav><h1>E-Library Management</h1></nav>
  
    <div class="container">
   <form action="adlog1.jsp" method="post">
          <label for="username">Username:</label>
          <input type="text" id="username" name="username">
          <br>
          <label for="password">Password:</label>
          <input type="password" id="password" name="password">
          <br>
          <input type="submit" value="Login">
        </form>
      </div>
    
</body>
</html>