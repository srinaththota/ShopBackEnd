package com.onlineshopping.sample.OnlineShopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@RequestMapping("/home")
public @ResponseBody	List allProducts(){
		return new ProductService().getProductsfromMongo();
		
	}
	
	@RequestMapping("/men")
public @ResponseBody	List menProducts(){
		return new ProductService().getMenProductsfromMongo();
		
	}
	
	@RequestMapping("/women")
	public @ResponseBody	List womenProducts(){
			return new ProductService().getWomenProductsfromMongo();
			
		}
}
