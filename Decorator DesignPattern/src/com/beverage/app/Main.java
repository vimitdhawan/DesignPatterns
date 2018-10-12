package com.beverage.app;

import com.beverage.app.decorator.Mocha;
import com.beverage.app.drinks.Beverage;
import com.beverage.app.drinks.Espresso;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Espresso("LARGE");
		Beverage bev = new Mocha(beverage);
		
		System.out.println(bev.cost());
		
		System.out.println(bev.getDescrption());

	}

}
