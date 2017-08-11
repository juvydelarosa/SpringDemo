package com.training.soapws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.training.soapws.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod  //optional if the Class is annotated as WS, all public methods will be webmethods
	public List<String> getProductCategories(){
		//call to business service
		return productService.getProductCategories();
	}
	
	@WebMethod(exclude=true)
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@WebMethod(exclude=true)
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
}
