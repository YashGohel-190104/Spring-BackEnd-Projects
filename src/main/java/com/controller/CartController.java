package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Bean.ECartBean;
import com.Bean.EUserBean;
import com.Dao.cartDao;

import jakarta.servlet.http.HttpSession;
@Controller
public class CartController {

	@Autowired
	cartDao cartDao;

	@GetMapping("/addtocart")
	public String addToCart(@RequestParam("productId") Integer productId, HttpSession session) {

		EUserBean userBean = (EUserBean) session.getAttribute("user");

		Integer userId = userBean.getUserId();

		ECartBean cartBean = new ECartBean();

		cartBean.setProductId(productId);
		cartBean.setUserId(userId);

		cartDao.addToCart(cartBean);

		return "redirect:/userproducts";// url
	}
}
