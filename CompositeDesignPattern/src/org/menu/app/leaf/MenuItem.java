package org.menu.app.leaf;

import org.menu.app.component.MenuComponent;

public class MenuItem  extends MenuComponent{
	String name;
	double price;
	
	public MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	public void print() {
		System.out.print(" "+ getName());
		System.out.println(", " + getPrice());
	}

}
