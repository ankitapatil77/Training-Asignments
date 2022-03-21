package com.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.dao.ProductDao;
import com.springboot.entity.Product;

public class ProductServiceImpl implements ProductServices{
	
	@Autowired
    private ProductDao productDAO;

    
    @Transactional
    public List < Product > getProduct() {
        return ProductDao.getProduct();
    }

    @Transactional
    public void saveProduct(Product theProduct) {
    	productDAO.saveProduct(theProduct);
    }

    @Transactional
    public Product getProduct(int theId) {
        return productDAO.getProduct(theId);
    }

    @Transactional
    public void deleteProdut(int theId) {
    	productDAO.deleteCustomer(theId);
    }


}
