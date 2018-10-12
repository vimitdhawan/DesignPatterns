package com.menuapp.iterator;

import java.util.List;

import com.menuapp.menu.MenuItem;

public class MorningIterator<T> implements Iterator<T> {
	
	List<MenuItem> menuItems;
	int position =0;
	
	public MorningIterator(List<MenuItem> menuItems){
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >=menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public T Next() {
		MenuItem menuItem = menuItems.get(position);
		position = position + 1;
		return (T) menuItem;
	}

}
