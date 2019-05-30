<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
</head>
<body>
	<%  HashMap<String,String> hm= new HashMap<String,String>();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		Date date=null;
		Boolean flag=false;
	 	hm.put("ansh", "2299");
		hm.put("anay", "khator");
		
		if(!(hm.containsKey(user))){
	%>
			<h1>No Such User</h1>
			<a href=login.html>Click here to Try Again</a>
	<%	}
		else if(!(hm.get(user).equals(pass))){
	%>
			<h1>Wrong Password!</h1>
			<a href=login.html>Click here to Try Again</a>
	<%	}
		else{
			out.print("<h1>Welcome "+user+"</h1>");
			date=new Date();			
			out.print("<h2>Today's Date: "+date+"</h2>");
	%>
			<form action="CalculateTax.jsp" method="get">
			Name : <input type="text" name="name">
			Profession <select name="prof">
				<option>Engineer</option>
				<option>Doctor</option>
			</select><br> Gender <select name="gender">
				<option>Male</option>
				<option>Female</option>
			</select>
			Income: <input type="text" name="income">
			<input type="submit">

		</form>
	<%	}
		
		%>
</body>
</html>