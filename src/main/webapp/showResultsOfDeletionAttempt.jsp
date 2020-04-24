<%@page import="com.granumignis.model.Item"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Official "Delete Results" Page</title>
</head>
<body bgcolor="cyan">

The results of the deletion query are below:

 <%
 
 	String deleteResults = (String)request.getAttribute("deleteResults");
 	out.println(deleteResults);
 
 %>
 
<a href="index.jsp">Return to the Main Page</a>

</body>
</html>