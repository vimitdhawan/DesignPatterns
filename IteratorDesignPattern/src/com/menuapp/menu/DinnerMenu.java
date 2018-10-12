package com.menuapp.menu;

import com.menuapp.iterator.DinnerIterator;
import com.menuapp.iterator.Iterator;

public class DinnerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", 2);
		addItem("BLT", 5);
	}
	
	public void addItem(String name, int price) {
		MenuItem menuItem = new MenuItem();
		menuItem.setName(name);
		menuItem.setPrice(price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can’t add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	@Override
	public Iterator createIterator() {
		return new DinnerIterator<MenuItem>(menuItems);
	}
	
	
	// other menu methods here
	}

