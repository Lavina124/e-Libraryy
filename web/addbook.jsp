                                                              <!-- This is admin section -->
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css"   href="mycss.css" >
    <!-- Font Awesome -->
    <script src="https://kit.fontawesome.com/a022230fba.js" crossorigin="anonymous"></script>
    <title>E-Library Management</title>
  </head>
    <body>
        <body>
            <nav>
                <h1><center>E-Library Management</center></h1></nav>
             <form action="addbook1.jsp" method="post">
                <div class="container">
                    <div class="rectangle">
                         <a href="addbook.jsp" class="button">Add Book</a>
        <a href="search.jsp" class="button">Search Book</a>
        <a href="bookup.jsp" class="button">Update Book</a>
        <a href="bookor.jsp" class="button">View Order</a>
        <a href="signout.jsp" class="button">Sign Out</a>
                    </div>
                </div>
                <div id="data">
                    <center>
                    
                    <table cellpadding="12px">
                    <h1> <b> <u>Add Books</u> </b> </h1>
                    
                    <tr>
                    <td> Book ID </td>
                    <td> <input type="text" name="u1" placeholder="Book ID"> </td>
                    </tr>
                    
                    <tr>
                    <td> Title </td>
                    <td> <input type="text" name="u2" placeholder="Title"> </td>
                    </tr>
                    
                    <tr>
                    <td> Author</td>
                    <td> <input type="text" name="u3" placeholder="Enter Name"> </td>
                    </tr>
                    
                    <tr>
                    <td> cost</td>
                    <td> <input type="text" name="u4" placeholder="enter price"> </td>
                    </tr>
                    
                    <tr>
                    <td> Quantity </td>
                    <td> <input type="text" name="u5" placeholder="Enter quantity"> </td>
                    </tr>
                    
                    <tr>
                    <th colspan="2"> <input type="submit" value="Add" class="B"> </th>
                    </tr>
                    
                    </table>
                    
                    
                    </center>
                    </div>
                    
                    </form>
    </body>
</html>
