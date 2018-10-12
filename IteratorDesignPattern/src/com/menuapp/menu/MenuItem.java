package com.menuapp.menu;

public class MenuItem {
	
	private String name;
	
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + "]";
	}
	
	

}
