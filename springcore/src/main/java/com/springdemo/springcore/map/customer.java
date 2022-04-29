package com.springdemo.springcore.map;

import java.util.Map;

public class customer {
	private int id;
	private static Map<Integer,String> products;
	@Override
	public String toString() {
		return "customer [id=" + id + ", products=" + products + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static Map<Integer,String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer,String> products) {
		this.products = products;
	}

}
