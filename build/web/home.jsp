<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
      integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
      crossorigin="anonymous"
    />
   
    <script
      src="https://kit.fontawesome.com/a022230fba.js"
      crossorigin="anonymous"
    ></script>
    <title>E-Library Management</title>
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
      
        #mymenu {
            background-color: #053d1a86;
    color: #201b1b;
    width: 403px;
    height: 201px;
    margin: 100px auto;
    padding: 10px;
    text-align: center;
    font-style: italic;
    font-size: larger;
        }

        #mymenu ul li {
            display: inline-block; /* Display list items side by side */
            margin: 20px;
        }

        #mymenu ul li a.admin-button img, #mymenu ul li a.student-button img {
            width: 100px;
            height: 100px;
            object-fit: cover;
            border-radius: 4px;
        }

        #mymenu ul li a span {
            display: block; /* Each name on a new line */
            margin-top: 5px; /* Add some space between the image and the name */
        }
    </style>
</head>
<body>
    <nav>
        <h1><center>E-Library Management</center></h1>
    </nav>
    <div id="mymenu">
        <ul>
            <li>
                <a href="adlog.jsp" class="admin-button">
                    <img src="admin.jpg" alt="Admin Image">
                    <span>Admin</span>
                </a>
            </li>
            <li>
                <a href="slogin.jsp" class="student-button">
                    <img src="student.png" alt="Student Image">
                    <span>Student</span>
                </a>
            </li>
        </ul>
    </div>
</body>
</html>
