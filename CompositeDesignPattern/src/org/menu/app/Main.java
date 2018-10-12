package org.menu.app;

import org.menu.app.component.MenuComponent;
import org.menu.app.composite.Menu;
import org.menu.app.leaf.MenuItem;

public class Main {
	public static void main(String args[]){
		MenuComponent allMenu = new Menu("All Menu");
		MenuComponent DinnerMenu = new Menu("Dinner Menu");
		MenuComponent DesertMenu = new Menu("Desert Menu");
		
		MenuComponent menuItem1 = new MenuItem("Kadahi Paneer", 50);
		MenuComponent menuItem2 = new MenuItem("Chicken", 100);
		
		MenuComponent subMenuItem1 = new MenuItem("Rasmalai", 20);
		MenuComponent subMenuItem2 = new MenuItem("Rasgula", 30);
		
		DesertMenu.add(subMenuItem1);
		DesertMenu.add(subMenuItem2);
		
		DinnerMenu.add(menuItem1);
		DinnerMenu.add(menuItem2);
		DinnerMenu.add(DesertMenu);
		
		allMenu.add(DinnerMenu);
		
		Waitress ws = new Waitress(allMenu);
		
		ws.printMenu();
		
		
	}

}
