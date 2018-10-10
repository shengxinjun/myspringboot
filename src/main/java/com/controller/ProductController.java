package com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.constrants.Constants;
import com.domain.Order;
import com.domain.Product;
import com.google.gson.Gson;
import com.model.OrderForm;
import com.model.ProductForm;
import com.model.Result;
import com.service.ProductService;
import com.util.DateUtil;
import com.util.ExcelUtils;
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
		paging.setPageSize(Constants.pageSize.LARGE_SIZE);
		paging.setPageNumber(pageNumber);
		paging = productService.productList(paging);
		model.addAttribute("paging", paging);
		return "product/productList";
	}
	@RequestMapping("/detail")
	String findProductById(Model model,Integer id) {
		Product product = productService.findProductById(id);
		model.addAttribute("product", product);
		return "product/productDetail";
	}
	
	@RequestMapping("/delete/{id}")
	String deleteById(@PathVariable Integer id) {
		Result result = new Result();
		try {
			productService.deleteProductById(id);
			result.setCode(1);
		} catch (MyException e) {
			result.setCode(e.getCode());
			result.setMessage(e.getMessage());
		}
		
		return "redirect:/product/list";
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
	
	@ResponseBody
	@PostMapping("/doAdd")
	Result doAdd(@RequestParam(required=false) String obj) {
		//将json转化为object
		Gson gson = new Gson();
		ProductForm productForm = gson.fromJson(obj, ProductForm.class);
		Product product = new Product();
		product.setName(productForm.getName());
		product.setType(productForm.getType());
		product.setDescription(productForm.getDescription());
		if(!StringUtils.isEmpty(productForm.getPrice())){
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		}
		product.setCreateDate(new Date());
		productService.insert(product);
		return Result.ok();
	}
	@ResponseBody
	@PostMapping("/doUpdate")
	Result doUpdate(@RequestParam(required=false) String obj) {
		//将json转化为object
		Gson gson = new Gson();
		ProductForm productForm = gson.fromJson(obj, ProductForm.class);
		Product product = productService.findProductById(productForm.getId());
		product.setName(productForm.getName());
		product.setType(productForm.getType());
		product.setDescription(productForm.getDescription());
		product.setImgs(productForm.getImgs());
		if(!StringUtils.isEmpty(productForm.getPrice())){
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		}
		product.setUpdateDate(new Date());
		productService.updateProduct(product);
		return Result.ok();
	}
	@RequestMapping("/export")
	@ResponseBody
	Result exportProduct(HttpServletRequest request,HttpServletResponse response,@RequestParam(required = false)String keyword,@RequestParam(defaultValue="1")Integer pageNumber){
		
		Paging<Product> paging = new Paging<>();
		paging.setKeyword(keyword);
		paging.setPageNumber(pageNumber);
		paging.setPageSize(Constants.pageSize.LARGE_SIZE);
		paging = productService.productList(paging);
		List<String> headers = Constants.EXCEL_HEAD.product;
		List<List<Object>> datas = new ArrayList<>();
		for(Product product: paging.getList()){
			List<Object> obj = new ArrayList<>();
			obj.add(product.getName());
			obj.add(product.getPrice());
			obj.add(product.getType());
			obj.add(product.getDescription());
			obj.add(product.getCreateDate());
			datas.add(obj);
		}
		try {
			ExcelUtils.generateCreateExcel(headers, datas, null, request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result(1, "");
	}
}
