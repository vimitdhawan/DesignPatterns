package com.caffeinebeverage.app.drinks;

import com.caffeinebeverage.app.template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage{

	@Override
	public void addCondiments() {
		System.out.println("Add Milk and Sugar");
		
	}

	@Override
	public void brew() {
		System.out.println("Add Coffee");
		
	}

}
