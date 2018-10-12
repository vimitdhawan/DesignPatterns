package org.menu.app;

import org.menu.app.component.MenuComponent;

public class Waitress {
	
	MenuComponent allMenu;
	
	public Waitress(MenuComponent allMenu){
		this.allMenu = allMenu;
	}
	
	public void printMenu(){
		allMenu.print();
	}

}
