<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.pass{
	color:blue;
}

.fail{
	color:red;
}
</style>
</head>
<body>
<%@include file="Header.jsp" %>
		<c:if test="${param.txtage ge 20 && param.txtage le 22 && (param.txtqual eq 'be' || param.txtqual eq 'btech') }">
			<c:set var="result" value="<span class='pass'>Eligible for java Fresher</span>"/>
			</c:if>
			
		<c:if test="${param.txtage lt 20 || param.txtage gt 22 ||(param.txtqual ne 'be' && param.txtqual ne 'btech') }">
			<c:set var="result" value="<span class='fail'>not Eligible </span>"/>
		</c:if>

<h1>Eligible Result</h1>


	<table cellpadding ="10" bgcolor="wheat" style="margin: 0 auto">
		<tr>
			<td> Employee Name</td>
			<td>${param.txtname}</td>
		</tr>
		
		<tr>
			<td>Age</td>
			<td>${param.txtage}</td>
		</tr>
		
		<tr>
			<td>Qualification</td>
			<td>${param.txtqual}</td>
		</tr>
		
		<tr>
			<td>Eligible/Not Eligible</td>
			<td>${pageScope.result}</td>
		</tr>

</body>
</html>