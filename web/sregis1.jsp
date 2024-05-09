<%@page import="java.sql.*" %>
<%
		String s1=request.getParameter("username");		
		String s2=request.getParameter("email");	
                String s3=request.getParameter("password");	
                String s4=request.getParameter("confirm_password");	
               
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st=con.createStatement();
			
			String q="insert into customers(username,email,password,confirm_password)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
			
			st.executeUpdate(q);
			
			out.println("<h1>Data Stored..</h1>");
                        response.sendRedirect("slogin.jsp");
			
			con.close();			
		}
		
		catch(Exception e1)
		{
			out.println(e1);
		}
		
		
		%>
