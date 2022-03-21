package com.shoppingCart.dao;

import java.util.List;

import com.shoppingCart.entity.Product;

public interface ProductDao {
	
	public static  List < Product > getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

    public void saveProduct(Product theProduct);

    public Product getProduct(int theId);

    public void deleteCustomer(int theId);

}
