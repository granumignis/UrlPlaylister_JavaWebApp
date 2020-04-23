<%@page import="com.granumignis.model.Item"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Official "Show Item For Update" Page</title>
</head>
<body bgcolor="cyan">
 
 <%
 
 	Item i1 = (Item)request.getAttribute("item");
 	out.println(i1);
 
 %>
 
 	<form action="updateItem">
	<br>
	
	* Modify the Values Below As desired. Note that itemID is read only * <br>
	* Use the Submit Button to Update the Database * <br>
	
	itemId: <input type="text" name="itemId" value="<%out.print(i1.getItemId());%>" readonly> <br><br>
	itemTitle: <input type="text" name="itemTitle" value="<%out.print(i1.getItemTitle());%>"> <br><br>
	itemUrl: <input type="text" name="itemUrl" value="<%out.print(i1.getItemUrl());%>"> <br><br>
	itemDuration: <input type="text" name="itemDuration"value="<%out.print(i1.getItemDuration());%>"> <br><br>
	
	<br>
	<input type="submit">
	</form>

</body>
</html>