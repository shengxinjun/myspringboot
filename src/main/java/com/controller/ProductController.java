package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.constrants.Constants;
import com.domain.Product;
import com.model.Result;
import com.service.ProductService;
import com.util.MyException;
import com.util.Paging;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/list")
	String list(Model model,@RequestParam(required = false,defaultValue="")String keyword,@RequestParam(defaultValue="1")Integer pageNumber) {
		Paging<Product> paging = new Paging<>();
		paging.setKeyword(keyword);
		paging.setPageSize(Constants.pageSize.MIDDLE_SIZE);
		paging = productService.productList(paging);
		model.addAttribute("paging", paging);
		return "product/productList";
	}
	
	@RequestMapping("/detail")
	String findProductById(Model model,Integer id) {
		Product product = productService.findProductById(id);
		model.addAttribute("product", product);
		return "";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	Result deleteById(Integer id) {
		Result result = new Result();
		try {
			productService.deleteProductById(id);
			result.setCode(1);
		} catch (MyException e) {
			result.setCode(e.getCode());
			result.setMessage(e.getMessage());
		}
		
		return result;
	}
	
	@RequestMapping("/deleteProduts")
	@ResponseBody
	Result deleteByIds(String list) {
		Result result = new Result();
		String[] ids = null;
		List<Integer> productIds = new ArrayList<>();
		ids = list.split(",");
		if (!StringUtils.isEmpty(ids)) {
			for(String id :ids) {
				Integer temp = Integer.parseInt(id);
				productIds.add(temp);
			}
		}
		try {
			productService.deleteProductsByIds(productIds);
			result.setCode(1);
		} catch (MyException e) {
			result.setCode(e.getCode());
			result.setMessage(e.getMessage());
		}
		
		return result;
	}
	
	@RequestMapping("/turnToAdd")
	String turnToAdd(){
		
		return "product/productDetail";
	}
}
