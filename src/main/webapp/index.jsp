<html>
<body>
<h2>Hello World2!</h2>
<br>
<br>
<b>getItem:</b>
	<form action="getItem">
	Input itemID to view it's attributes from the database!<br><br>
		itemID: <input type="text" name="itemId">
		<input type="submit">
	</form>
<br>
<br>
<b>createItem:</b>
	<form action="createItem">
	<br>
	
	Press Submit Button to create an item?
	itemId: <input type="text" name="itemId"> <br><br>
	itemTitle: <input type="text" name="itemTitle"> <br><br>
	itemUrl: <input type="text" name="itemUrl"> <br><br>
	itemDuration: <input type="text" name="itemDuration"> <br><br>
	
	<br>
	<input type="submit">
	</form>
	
	
<b>updateItem:</b>
	<form action="updateItem">
	<br>
	
	Enter the itemId of the item you would like to update.
	itemId: <input type="text" name="itemId"> <br><br>
	
	<br>
	<input type="submit">
	</form>
	
</body>
</html>
