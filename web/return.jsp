<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   
</head>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500&display=swap');
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
#data h2{
    color: white;
    font-weight: bold;
}
table{
background-color: rgba(0, 0, 0, 0.397);
color: white;
width: 30%;
height: auto;
margin: 2% auto;
text-align: left;
justify-content: center;
}
tr, th{
border: 1px solid black;
padding: 8px;
color: white;
font-family: bold;
}
td{
    border: 2px solid black;
    padding: 10px;
}



</style>
<body>
    <nav>
        <h2>E-Library Management</h2>
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
<div id="data">
    <center>
        <h2><u>Return book</u></h2>
        <form action="return1.jsp" method="post">
      <table cellpadding="12px">
           <tr>
          <td>Name </td>
          <td><input type="text" name="uname" ></td>
        </tr>
         <tr>
          <td>ID </td>
          <td><input type="text" name="id" ></td>
        </tr>
        <tr>
          <td>Book Name </td>
          <td><input type="text" name="bname" ></td>
        </tr>
        
        <tr>
          <td>Author Name </td>
          <td><input type="text" name="aname" ></td>
        </tr>
        <tr>
          <th colspan="2"> <input type="submit" value="Return" class="button"> </th>
          </tr>
      </table>
        </form>>
    </center>

  </div>
  
</body>
</html>

    