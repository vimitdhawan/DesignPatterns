package com.menuapp.menu;

import java.util.ArrayList;
import java.util.List;

import com.menuapp.iterator.Iterator;
import com.menuapp.iterator.MorningIterator;

public class MorningMenu implements Menu{
	
	private List<MenuItem> menuItems;
	
	public MorningMenu() {
		menuItems = new ArrayList<>();
		addItem("Paranthe", 2);
		addItem("Poha", 5);
	}
	
	public void addItem(String name, int price) {
		MenuItem menuItem = new MenuItem();
		menuItem.setName(name);
		menuItem.setPrice(price);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator<?> createIterator() {
		// TODO Auto-generated method stub
		return new MorningIterator<>(menuItems);
	}

}
