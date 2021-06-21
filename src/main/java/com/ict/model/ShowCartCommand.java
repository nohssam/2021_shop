package com.ict.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.VO;

public class ShowCartCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		List<VO> cartList = Cart.cartList;
		
		request.setAttribute("cartList", cartList);
		request.setAttribute("total", Cart.total);
		return "view/viewcart.jsp";
	}
}
