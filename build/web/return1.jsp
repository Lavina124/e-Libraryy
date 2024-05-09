<%@page import="java.sql.*" %>
<%
		String s1=request.getParameter("uname");		
		String s2=request.getParameter("id");	
                String s3=request.getParameter("bname");	
                String s4=request.getParameter("aname");	
               
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st=con.createStatement();
			
			String q="insert into rebook(uname,id,bname,aname)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
			
			st.executeUpdate(q);
			
			out.println("<h1>Data Stored..</h1>");
                        response.sendRedirect("return1.jsp");
			
			con.close();			
		}
		
		catch(Exception e1)
		{
			out.println(e1);
		}
		
		
		%>
