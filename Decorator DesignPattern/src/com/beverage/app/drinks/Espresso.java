package com.beverage.app.drinks;

import com.beverage.app.Size;

public class Espresso extends Beverage{
	
	public Espresso(String size){
		this.size = size;
	}

	@Override
	public double cost() {
		if(this.size.equals(Size.LARGE)){
			return 100;
		} else {
			return 70;
		}
		
		
	}

	@Override
	public String getDescrption() {
		// TODO Auto-generated method stub
		return "Espresso beverages";
	}

}
