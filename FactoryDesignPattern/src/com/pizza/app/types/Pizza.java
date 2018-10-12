package com.pizza.app.types;

import com.pizza.app.dough.Dough;
import com.pizza.app.ingredientfactory.PizzaIngredientFactory;
import com.pizza.app.sauces.Sauce;

public abstract class Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	String name;
	Dough dough;
	Sauce sauce;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake " + name + "at 300 for 20 minutes with" + dough.doughType() + sauce.getSauce());
		
	}

	public void cut() {
		System.out.println("cut into three pieces");
		
	}

	public void box() {
		System.out.println("Packed into box");
		
	}
	
	public String getName(){
		return name;
	}

}
