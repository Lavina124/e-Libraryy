<!student section-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
    
    
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
.register-box {
    width: 360px;
    height: 500px;
    background-color: #14642c;
    border: 1px solid #ccc;
    padding: 57px;
    margin: 84px auto;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }
  
  .register-box h2 {
    text-align: center;
    margin-top: 0;
  }
  
  .register-box label {
    display: block;
    margin-bottom: 10px;
  }
  
  .register-box input[type="text"],.register-box input[type="email"],.register-box input[type="password"] {
    width: 100%;
    height: 20px;
    margin-bottom: 20px;
    padding: 10px;
    border: 1px solid #ccc;
  }
  
  .register-box input[type="submit"] {
    width: 100%;
    height: 30px;
    background-color: #4CAF50;
    color: #fff;
    padding: 10px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
  
  .register-box input[type="submit"]:hover {
    background-color: #45a049;
  }</style>
<body>
    <nav><h1><center>E-Library Management</center></h1></nav>
    <div class="register-box">
        <h2>Register</h2>
        <form action="sregis1.jsp" method="post" >
          <label for="username">Username:</label>
          <input type="text" id="username" name="username" ><br><br>
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" ><br><br>
          <label for="password">Password:</label>
          <input type="password" id="password" name="password" ><br><br>
          <label for="confirm-password">Confirm Password:</label>
          <input type="password" id="confirm-password" name="confirm_password" ><br><br>
          <input type="submit" value="Register" >
          Already a customer!!
          <a href="slogin.jsp" >Login Here</a><br/>
        </form>
      </div>
</body>
</html>