
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>view Data info</title>

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500&display=swap');
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    text-align: center;
    
    border-radius: 2px solid black;
    font-weight: bold;
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

nav h2 {
margin: 0;
color :white;
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

table{
background-color: rgb(18 26 21 / 78%);;
color: white;
width: 30%;
height: auto;
margin: 2% auto;
text-align: left;
justify-content: center;
}
tr{
border: 1px solid black;
padding: 8px;
color: white;
font-family: bold;
}
td{
    border: 2px solid black;
    padding: 10px;
}

        th {
            background-color: #266532;
        }
        .view h1{
            color: white;
            text-align: center;
        }
        .B
{
  padding: 12px;
  background: linear-gradient(#35523a, #2e703a);
  font-size: 13px;
  font-weight: bold;
  color: black;
  border-style: outside;
  border-color: black black black black;
  border-radius: 10px;
}

.B:hover
{
padding :12px;
background:linear-gradient(#35523a, #2e703a);
color:black;
font-size:15px;
font-weight:bold;
border-radius:10px;
}


        
    </style>
</head>
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
    
      
            
                 <div class="view"><h1><center>VIEW BOOKS INFORMATION </center></h1></div>

            <div id="data">
                <%
                try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st = con.createStatement();
			
			String q = "select* from books";
			ResultSet re = st.executeQuery(q);
                        %>
			<center>
			<table cellpadding='12px'>
                            <th>Book_id</th>
			<th>title</th>
			<th>author</th>
			<th>Cost</th>
			
			<%
			while(re.next())
			{
                            %>
				<tr>
				<td><%=re.getString(1)%></td>
                                <td><%=re.getString(2)%></td>
                                <td><%=re.getString(3)%></td>
                                <td><%=re.getString(4)%></td>
                               
				</tr>
                                <%
			}%>
			</table>
			</center>
                        
                        <%
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
                        }
%>

</div>	
            

        </body>
</html>