package com.menuapp.iterator;

import com.menuapp.menu.MenuItem;

public class DinnerIterator<T> implements Iterator<T> {
	MenuItem[] menuItems;
	int position =0;
	
	public DinnerIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
		
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public T Next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return (T) menuItem;
		
	}

}
