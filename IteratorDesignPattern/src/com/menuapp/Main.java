package com.menuapp;

import com.menuapp.menu.DinnerMenu;
import com.menuapp.menu.MorningMenu;

public class Main {

	public static void main(String[] args) {
		DinnerMenu dm = new DinnerMenu();
		MorningMenu mm = new MorningMenu();
		Waitress waitress = new Waitress(dm, mm);
		waitress.printMenu();
	}

}
