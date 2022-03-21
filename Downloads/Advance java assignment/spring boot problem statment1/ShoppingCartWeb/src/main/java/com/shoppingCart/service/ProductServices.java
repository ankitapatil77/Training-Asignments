package com.shoppingCart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingCart.entity.Product;

@Service
public interface ProductServices {
	
	

    public static void saveProduct(Product theProduct) {
		// TODO Auto-generated method stub
		
	}

    public static Product getProduct(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

    public static void deleteProduct(int theId) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getProduct();

}
