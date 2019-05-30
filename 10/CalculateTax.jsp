<%@page import="java.util.Date"%>
<%@page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculate Tax</title>
</head>
<body>
	<%
		float taxp=0;
		float taxamt=0;
		String taxbracket="";
		float income=Float.parseFloat(request.getParameter("income"));
		if(income<100000){
			taxp=0;
			taxamt=0;
			taxbracket="Income under Rs.100000(exclusive)";
		}
		else if(income<500000){
			taxp=15;
			taxamt=(income-100000)*0.15f;
			taxbracket="Income between Rs.100000(inclusive) and Rs.500000(exclusive)";
		}
		else{
			taxp=20;
			taxamt=(income-500000)*0.20f + 400000*0.15f;
			taxbracket="Income above Rs.500000(inclusive)";
		}
		
		session.setAttribute("taxp", taxp);
		session.setAttribute("taxamt", taxamt);
		session.setAttribute("taxbracket", taxbracket);
		
		out.println("<h1>Tax Details</h1>");
		out.println("<h4>Name: "+request.getParameter("name")+"</h4>");
		out.println("<h4>Profession: "+request.getParameter("prof").toUpperCase()+"</h4>");
		out.println("<h4>Gender: "+request.getParameter("gender").toUpperCase()+"</h4>");
		out.println("<h4>Annual Income: Rs."+request.getParameter("income")+"</h4>");
		out.println("<h4>Tax Bracket: "+session.getAttribute("taxbracket"));
		out.println("<h4>Tax Percent: "+session.getAttribute("taxp")+"%</h4>");
		out.println("<h4>Tax Amount: Rs."+session.getAttribute("taxamt")+"</h4>");
		
		session.invalidate();

	%>
	
	<a href="login.html" onclick="">Logout</a>
	</body>
</html>