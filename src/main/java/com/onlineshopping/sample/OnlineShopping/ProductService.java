package com.onlineshopping.sample.OnlineShopping;

import java.util.Arrays;
import java.util.List;

public class ProductService {

	List getProductsfromMongo(){

		List<Product> l=Arrays.asList(
				new Product(1001,"http://media.istockphoto.com/photos/the-carefree-days-picture-id488027919","iStock"),
				new Product(1002,"http://www.hs-ltd.com/wp-content/uploads/2016/07/The-Men%E2%80%99s-Fashion-Basics.jpg","in USA"),
				new Product(1003,"http://st1.bollywoodlife.com/wp-content/uploads/photos/katrina-kaif-in-a-fashion-show-201602-673123.jpg","Bollywood dress"),
				new Product(1004,"http://media.santabanta.com/gal/Fashion/Aditya-and-Katrina-at-Tarun-Tahiliani-Fashion-Show/aditya-and-katrina-at-tarun-tahiliani-fashion-show-16.jpg","Modelling dress"),
				new Product(1005,"http://cdn1.chitramala.in/wp-content/uploads/2017/05/Raasi-Khanna.jpg","South heroine dress"),
				new Product(1006,"https://2.bp.blogspot.com/--vCy4X2bLvk/V18Io8ckXjI/AAAAAAAF450/ClXjpH2XJL4karHKCg5WDFGz9GTFktUVwCLcB/s1600/CineMaa-Awards-2016-Red-carpet-043.jpg","South saree"));
		
		return l;
	}

	public List getMenProductsfromMongo() {
		// TODO Auto-generated method stub
		List<Product> l=Arrays.asList(
				new Product(1001,"http://media.istockphoto.com/photos/the-carefree-days-picture-id488027919","iStock"),
				new Product(1002,"http://www.hs-ltd.com/wp-content/uploads/2016/07/The-Men%E2%80%99s-Fashion-Basics.jpg","in USA"));
		
		return l;
	}

	public List getWomenProductsfromMongo() {
		List<Product> l=Arrays.asList(
				new Product(1003,"http://st1.bollywoodlife.com/wp-content/uploads/photos/katrina-kaif-in-a-fashion-show-201602-673123.jpg","Bollywood dress"),
				new Product(1004,"http://media.santabanta.com/gal/Fashion/Aditya-and-Katrina-at-Tarun-Tahiliani-Fashion-Show/aditya-and-katrina-at-tarun-tahiliani-fashion-show-16.jpg","Modelling dress"),
				new Product(1005,"http://cdn1.chitramala.in/wp-content/uploads/2017/05/Raasi-Khanna.jpg","South heroine dress"),
				new Product(1006,"https://2.bp.blogspot.com/--vCy4X2bLvk/V18Io8ckXjI/AAAAAAAF450/ClXjpH2XJL4karHKCg5WDFGz9GTFktUVwCLcB/s1600/CineMaa-Awards-2016-Red-carpet-043.jpg","South saree"));
		
		return l;
	}
}
