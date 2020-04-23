package com.granumignis.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.granumignis.model.Item;
import com.granumignis.web.dao.ItemDao;


public class GetItemForUpdateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int itemId = Integer.parseInt(request.getParameter("itemId"));
		ItemDao dao = new ItemDao();
		Item i1 = dao.getItem(itemId);
		
		request.setAttribute("item", i1);		
		
		RequestDispatcher rd = request.getRequestDispatcher("showItemForUpdate.jsp");
		rd.forward(request, response);
		
	}

}
