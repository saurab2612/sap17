<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
a{
		
		background-color:blue;
		color:white;
		text-decoration: none;
		padding: 5px;
		border-radius: 10px;
		box-shadow: 5px 5px 5px gray;
	}
a:hover{
		background-color: yellow;
		color:black;
		text-decoration: underline;
	}
</style>
</head>
<body>
<%@include file="Header.jsp" %>
<h1 align="center">Home page</h1>

<table cellpadding="10" style="margin: 0 auto">
<tr>
	<td><a href ="TaxForm.jsp">Tax calculation</a></td>
</tr>

<tr>
	<td><a href ="SkillFrm.jsp">Update profile</a></td>
</tr>

<tr>
	<td><a href ="QuizFrm.jsp">play quiz</a></td>
</tr>

<tr>
	<td><a href ="EligibleFrm.jsp">Eligible for Java Developer?</a></td>
</tr>

<tr>
	<td><a href ="HtmlTutorial.jsp">html format</a></td>
</tr>
</body>
</html>