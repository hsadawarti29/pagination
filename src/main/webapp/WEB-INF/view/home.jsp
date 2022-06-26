<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Hello Arc </h1>

	<form action="show">	

		Search : <input type = "text" name="name">
		
		<input type = "submit">


</form>

<table>
	<tr>
	
	<td> ID </td>
	<td> NAME</td> 
	<td> PRICE </td>
	<td> DES </td>

	</tr>
	
		<c:forEach var="temp" items="${amazonData}">
		
	<tr>
		<td> ${temp.id } </td>
		<td> ${temp.name } </td>
		<td> ${temp.price } </td>
		<td> ${temp.des } </td>
		
		<%-- <td> <a href="deleteUser?id=${temp.id }"> Delete </a></td>
		<td> <a href="updateUser?id=${temp.id }"> Update </a></td> --%>
		
	</tr>
	
	
	</c:forEach>	
	
</table>

</body>

</html>