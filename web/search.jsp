<!--admin section-->
<%@page import="java.sql.*" %>
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
                <div class="container">
                    <div class="rectangle">
                        <a href="addbook.jsp" class="button">Add Book</a>
        <a href="search.jsp" class="button">Search Book</a>
        <a href="bookup.jsp" class="button">Update Book</a>
        <a href="bookor.jsp" class="button">View Order</a>
        <a href="signout.jsp" class="button">Sign Out</a>
                    </div>
                </div>
                <h1><center>Search your Data </center></h1>
                <div id="data">
                    <center>
                    <form action="search.jsp">
                        <table cellpadding="20px">
                            <tr>
                                <td> Enter ID </td>
    <td> <input type="text" name="u2" placeholder="Enter ID" > </td>
    </tr>
    
    
    <tr>
        <th colspan="2"> <input type="submit" value="Search" name="b1" class="B"> </th>
    </tr>
    
    </table>
                    </form>
        </body>
         <%
                String b1=request.getParameter("b1");
                if(b1!=null)
                {
                String s2=request.getParameter("u2");
                try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st = con.createStatement();
			
			String q = "select* from books Where book_id='"+s2+"'";
			ResultSet rs= st.executeQuery(q);
			
			
                        
                        
                        if(rs.next())
                        {
                            %>
                            <table cellpadding='12'>
                                <tr>
                        <td>Book_id:</td>
                          <td><%= rs.getString(1)%></td>
                        </tr>
                        <tr>
                        <td>Title:</td>
                          <td><%= rs.getString(2)%></td>
                        </tr>
                        <tr>
                        <td>Author</td>
                          <td><%= rs.getString(3)%></td>
                        </tr>
                        <tr>
                        <td>Cost</td>
                          <td><%= rs.getString(4)%></td>
                        </tr>
                        <tr>
                        <td>Quantity</td>
                          <td><%= rs.getString(5)%></td>
                        </tr>
                            </table>   
                         <% 
                        }

			else
			{
				out.println("NOT FOUND!!");
			}
			

}
		catch(Exception e)
		{
			out.println(e);
		}
}
                %>
    </body>
</html>
