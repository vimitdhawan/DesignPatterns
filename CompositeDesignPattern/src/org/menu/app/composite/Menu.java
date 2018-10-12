package org.menu.app.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.menu.app.component.MenuComponent;

public class Menu extends MenuComponent {
	List<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	
	public Menu(String name) {
		this.name = name;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("\n" + getName());
		System.out.println("---------------------");
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
		MenuComponent menuComponent = iterator.next();
		menuComponent.print();
		}
	}

}
