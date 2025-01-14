package com.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Bean.EProductBean;
import com.Dao.EProductDao;
@Controller
public class UserProductController {

	@Autowired
	EProductDao productDao;

	@GetMapping("/userproducts")
	public String listProducts(Model model) {
		List<EProductBean> products = productDao.getAllProducts();// return type

		model.addAttribute("products", products);

		return "EcomUserProducts";
	}
}
