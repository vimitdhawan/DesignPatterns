package com.beverage.app.drinks;

public abstract class Beverage {
	
	public String size;
	
	public abstract double cost();
	
	public abstract String getDescrption();
	
	public String getSize(){
		return size;
	}

}
