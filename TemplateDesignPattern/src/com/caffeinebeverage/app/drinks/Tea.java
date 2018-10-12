package com.caffeinebeverage.app.drinks;

import com.caffeinebeverage.app.template.CaffeineBeverage;

public class Tea extends CaffeineBeverage{

	@Override
	protected void addCondiments() {
		System.out.println("Add Milk");
		
	}

	@Override
	public void brew() {
		System.out.println("Add Tea Leafs");
		
	}

}
