<%@page import="java.sql.*" %>
<%

		String s1=request.getParameter("u1");		
		String s2=request.getParameter("u2");		
		String s3=request.getParameter("u3");		
		String s4=request.getParameter("u4");		
		String s5=request.getParameter("u5");		
		
		out.println("<html>");
	    out.println("<head>");
	    out.println("<link rel='stylesheet' href='mycss.css'>");
	    out.println("</head>");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st=con.createStatement();
			
			String q="insert into books(book_id,title,author,cost,quantity)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
			
			st.executeUpdate(q);
			
			out.println("<h1>Your Data has been Submited</h1>");
			
			response.sendRedirect("addbook.jsp");
			
			con.close();			
		}
		
		catch(Exception e1)
		{
			out.println(e1);
		}
		
		%>