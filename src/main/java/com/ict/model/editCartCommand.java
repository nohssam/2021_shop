package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class editCartCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		int su = Integer.parseInt(request.getParameter("su"));
		String idx = request.getParameter("idx");
		
		Cart.setQuant(idx, su);
		return "MyController?cmd=showCart";
	}
}
