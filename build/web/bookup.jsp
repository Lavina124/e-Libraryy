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
                <div id="data">
                    <center>
                        <h1>Book Update</h1>
                        <table cellpadding='20px'>
                            <form action="bookup.jsp">
                                <caption style='font-weight:bold;font-size:30px'></b></caption>
                                <tr><td>Book ID</td>
                                    <td><input type='text' placeholder='Enter Book Id' name='u2'></td>
                                    <td><input type='submit' value='Search' name="b1" class="B"></td>
                                </tr>
                                </table>
                        </form>
                            <%                    String b=request.getParameter("b1");
                        if(b!=null)
                        {
                            String s2=request.getParameter("u2");
             try
	  {
		  Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
		  Statement st=con.createStatement();
		  String q="select * from books where book_id='"+s2+"'";
		  ResultSet rs=st.executeQuery(q);
		  if(rs.next())
	          {
                      %><form action="bookup.jsp">
                      <table cellpadding="12px">
                          <input type="hidden" name="n2" value=<%=rs.getString(1)%>>
                          <tr>
                              <td>title</td>
                              <td><input type="text" name="n1" value=<%=rs.getString(2)%>></td>
                              </tr>
                              <tr>
                              <td>Author</td>
                              <td><input type="text" name="n3" value=<%=rs.getString(3)%>></td>                              </tr>
                              <tr>
                              <td>Cost</td>
                              <td><input type="text" name="n4" value=<%=rs.getString(4)%>></td>
                              </tr>
                              <tr>
                              <td>Quantity</td>
                              <td><input type="text" name="n5" value=<%=rs.getString(5)%>></td>
                              </tr>
                              <tr>
                                  <th colspan="2"><input type="submit" value="update" name="b2" class="B"></th>
                                  </tr>
                              </table>
                              </form>
                         <%}	  
                   else
	            out.print("invalid id");
                   con.close();
	  }
	  catch(Exception e)
	  {
		  out.print(e);
	  }
          }
          %>
          <%String b2=request.getParameter("b2");
          if(b2!=null)
          {
              String n1=request.getParameter("n1");
               String n2=request.getParameter("n2");
                String n3=request.getParameter("n3");
                 String n4=request.getParameter("n4");
                  String n5=request.getParameter("n5");
            try
                   {
	          Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
             Statement st=con.createStatement();
                  String q="update books set title='"+n1+"' , author='"+n3+"' ,cost='"+n4+"',Quantity='"+n5+"' where book_id='"+n2+"'";
                  st.executeUpdate(q);
                 response.sendRedirect("search.jsp");
                  con.close();
          }
                                
         catch(Exception e1)
         {
             out.println(e1);
         }
}%>
                        </center>
                </div>
        </body>
    </body>
</html>