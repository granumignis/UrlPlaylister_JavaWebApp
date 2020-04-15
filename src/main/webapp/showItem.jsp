<%@page import="com.granumignis.model.Item"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
 
 <%
 
 	Item i1 = (Item)request.getAttribute("item");
 	out.println(i1);
 
 %>

</body>
</html>