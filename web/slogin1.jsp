 


<%@page import="java.sql.*" %>

<% String s1=request.getParameter("username");		
		String s3=request.getParameter("password");		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st=con.createStatement();
			
			String q="select * from customers Where username='"+s1+"' AND password='"+s3+"'";
			
			ResultSet re=st.executeQuery(q);
			
			if(re.next())
			{
                           
				Cookie ck=new Cookie("WELCOME",s1);
                                ck.setMaxAge(60*30);
                                response.addCookie(ck);
                               
                               /* Cookie[] c=request.getCookies();*/
                               response.sendRedirect("studash.jsp");
			}	
			else
			{
				response.sendRedirect("slogin.jsp");
			}
			
			
			con.close();			
		}
		
		catch(Exception e1)
		{
			out.println(e1);
		}
                %>