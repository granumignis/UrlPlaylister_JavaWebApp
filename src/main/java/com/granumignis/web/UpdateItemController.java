package com.granumignis.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.granumignis.model.Item;
import com.granumignis.web.dao.ItemDao;


public class UpdateItemController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int itemId = Integer.parseInt(request.getParameter("itemId"));
		String itemTitle = request.getParameter("itemTitle");
		String itemUrl = request.getParameter("itemUrl");
		int itemDuration = Integer.parseInt(request.getParameter("itemDuration"));	
		
		ItemDao dao = new ItemDao(); 
		Item i1 = dao.updateItem(itemId, itemTitle, itemUrl, itemDuration);
		
		request.setAttribute("item", i1);
		
		RequestDispatcher rd = request.getRequestDispatcher("showItem.jsp");
		rd.forward(request, response);
		 		
	}

}
