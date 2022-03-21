package com.shoppingCart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "book_id")
	int book_id;
	
	@Column(name = "book_name")
	String book_name;
	
	@Column(name = "Author")
	String Author;
	 
	@Column(name = "Price")
	int price;
	 
	public Product(int book_id, String book_name, String author, int price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		Author = author;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [book_id=" + book_id + ", book_name=" + book_name + ", Author=" + Author + ", price=" + price
				+ "]";
	}
	
	

}
