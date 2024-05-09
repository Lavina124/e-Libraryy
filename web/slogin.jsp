<!student section-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>student Login</title>
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
  }
  
  nav h1 {
    margin: 0;
  }
  .login-box {
    width: 357px;
    height: 271px;
    background-color: #155a29;
    border: 1px solid #218253;
    padding: 47px;
    margin: 135px auto;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}


.login-box h2 {
  text-align: center;
  margin-top: 0;
}

.login-box label {
  display: block;
  margin-bottom: 8px;
}

.login-box input[type="text"],.login-box input[type="password"] {
    width: 84%;
    height: 20px;
    margin-bottom: 5px;
    padding: 12px;
    border: 1px solid #ccc;
}
.login-box a{
    font-style: bold;
    line-height: 20px;
}
.login-box input[type="submit"] {
  width: 100%;
  height: 30px;
  background-color: #4CAF50;
  color: #fff;
  padding: 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}
  
</style>
<body>
    <nav><h1><center>E-Library Management</center></h1></nav>
    <div class="login-box">
        <h2>Login</h2>
        <form action="slogin1.jsp" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username"><br><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"><br><br>
            Not a Member yet!!
            <a href="sregister.jsp" >Register Here</a><br/>
            <input type="submit" value="Login">
          </form>
      
      
</body>
</html>