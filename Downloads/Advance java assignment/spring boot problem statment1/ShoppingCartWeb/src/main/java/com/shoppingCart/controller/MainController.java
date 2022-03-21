package com.shoppingCart.controller;

import java.util.List;


import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoppingCart.entity.Product;
import com.shoppingCart.service.ProductServices;

@Controller
@RequestMapping("/books")
public class MainController {
	
	@Autowired
    private ProductServices productService;

    @GetMapping("/list")
    public String listProduct(Model theModel) {
        List < Product  > theProduct = productService.getProduct();
        theModel.addAttribute("Product", theProduct);
        return "list-Product";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Product theProduct = new Product();
        theModel.addAttribute("Product", theProduct);
        return "product-form";
    }

    @PostMapping("/saveBook")
    public String saveProduct(@ModelAttribute("Product") Product theproduct) {
        ProductServices.saveProduct(theproduct);
        return "redirect:/product/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("book_id") int theId,
        Model theModel) {
        Product theProduct = ProductServices.getProduct(theId);
        theModel.addAttribute("Product", theProduct);
        return "product-form";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("book_id") int theId) {
        ProductServices.deleteProduct(theId);
        return "redirect:/product/list";
    }

}
