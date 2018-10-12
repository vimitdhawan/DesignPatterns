package com.pizza.app.ingredientfactory;

import com.pizza.app.dough.Dough;
import com.pizza.app.dough.ThickDough;
import com.pizza.app.sauces.Sauce;
import com.pizza.app.sauces.SpicySauce;

public class NewyorkPizzaIngredentFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new SpicySauce();
	}


}
