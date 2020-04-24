package com.granumignis.web.dao;

import java.sql.*;
import com.granumignis.model.Item;

public class ItemDao 
{	
	public Item getItem(int itemId)
	{
		Item i = new Item();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urlplaylister","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from item where itemId =" + itemId);
			
			if (rs.next())
			{
				i.setItemId(rs.getInt("itemId"));
				i.setItemTitle(rs.getString("itemTitle"));
				i.setItemUrl(rs.getString("itemUrl"));
				i.setItemDuration(rs.getInt("itemDuration"));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		return i;		
	}
	
	
	public Item createItem(int itemId, String itemTitle, String itemUrl, int itemDuration)
	{
		Item i = new Item();
		
		String url = "jdbc:mysql://localhost:3306/urlplaylister";
		String uname = "root";
		String pass = "";
		
		i.setItemId(itemId);
		i.setItemTitle(itemTitle);
		i.setItemUrl(itemUrl);
		i.setItemDuration(itemDuration);
		
		
		String query ="insert into item values(?,?,?,?)";
		
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(query);
			
			st.setInt(1, itemId);
			st.setString(2, itemTitle);
			st.setString(3, itemUrl);
			st.setInt(4, itemDuration);
				
			int preparedStatementResults = st.executeUpdate();
			
			System.out.println(st.toString());
			System.out.println(preparedStatementResults + " row(s) affected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return i;
	}


	public Item updateItem(int itemId, String itemTitle, String itemUrl, int itemDuration)
	{
		Item i = new Item();		
		String url = "jdbc:mysql://localhost:3306/urlplaylister";
		String uname = "root";
		String pass = "";			
		String query ="update item set itemTitle=?, itemUrl=?, itemDuration=? where itemId=?";

		i.setItemId(itemId);
		i.setItemTitle(itemTitle);
		i.setItemUrl(itemUrl);
		i.setItemDuration(itemDuration);
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(query);
			
			st.setString(1, i.getItemTitle());
			st.setString(2, i.getItemUrl());
			st.setInt(3, i.getItemDuration());
			st.setInt(4, i.getItemId());
					
			System.out.println(st.toString());
			
			int preparedStatementResults = st.executeUpdate();
			
			System.out.println(st.toString());
			System.out.println(preparedStatementResults + " row(s) affected");
			
			i = getItem(itemId);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return i;
	}



	public String deleteItem(int itemId)
	{
	
		String url = "jdbc:mysql://localhost:3306/urlplaylister";
		String uname = "root";
		String pass = "";
		String query ="delete from item where itemID=?";
		String queryResult = "";

		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(query);
			
			st.setInt(1, itemId);
				
			int preparedStatementResults = st.executeUpdate();
			
			System.out.println(st.toString());
			queryResult = preparedStatementResults + " row(s) affected by delete query.";
			System.out.println(queryResult);
			return queryResult;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return e.toString();
		}
		
	}

}
