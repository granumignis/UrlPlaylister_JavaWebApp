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
		
		/* This Block Commented Out Because I need to flesh out GetItemForUpdateController.java first
		 * 04/22/20 - LMJOH
		 * 
		 * int itemId = Integer.parseInt(request.getParameter("itemId"));
		 * 
		 * ItemDao dao = new ItemDao(); Item i1 = dao.updateItem(itemId);
		 * 
		 * request.setAttribute("item", i1);
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("updateItem.jsp");
		 * rd.forward(request, response);
		 */		
	}

}
