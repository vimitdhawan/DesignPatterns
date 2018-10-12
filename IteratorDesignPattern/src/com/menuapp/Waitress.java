package com.menuapp;

import com.menuapp.iterator.Iterator;
import com.menuapp.menu.DinnerMenu;
import com.menuapp.menu.MenuItem;
import com.menuapp.menu.MorningMenu;

public class Waitress {
	private DinnerMenu dinnerMenu;
	private MorningMenu morningMenu;
	
	public Waitress(DinnerMenu dinnerMenu, MorningMenu morningMenu) {
		this.dinnerMenu = dinnerMenu;
		this.morningMenu = morningMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> dinnerIterator = (Iterator<MenuItem>) dinnerMenu.createIterator();
		Iterator<MenuItem> morningIterator = (Iterator<MenuItem>) morningMenu.createIterator();
		printMenu(dinnerIterator);
		printMenu(morningIterator);
	}
	
	private void printMenu(Iterator iteartor) {
		while(iteartor.hasNext()){
			System.out.println(iteartor.Next());
		}
	}
	

}
