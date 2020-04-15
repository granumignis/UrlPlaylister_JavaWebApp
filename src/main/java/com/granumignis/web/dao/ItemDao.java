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
}
