<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="tcon" method="post">
Accessories:<input type="checkbox" name="accessories" value="belt">belt
<input type="checkbox" name="accessories" value="cap">cap
<input type="checkbox" name="accessories" value="hair">hair
<br>

Tagline :<input type="text" name="tag"><br>
Type:<input type="radio" name="type" value="chest">chest pocket
<input type="radio" name="type" value="without chest">without chest pocket<br>

Color:
<select name="color">
<option value="green">green</option>
<option value="red">red</option>
<option value="blue">blue</option>
<option value="magenta">magenta</option>
</select>
<br>

<button type="submit">Submit</button>
</form>

</body>
</html>

