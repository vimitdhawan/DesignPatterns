package com.beverage.app.decorator;

import com.beverage.app.Size;
import com.beverage.app.drinks.Beverage;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha (Beverage beverage){
		this.beverage = beverage;
		
	}

	@Override
	public double cost() {
		if (this.beverage.getSize().equals(Size.LARGE)){
			return this.beverage.cost()+20;
		} else{
			return this.beverage.cost()+50;
		}
		
	}

	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return this.beverage.getDescrption() + " with mocha";
	}
}
