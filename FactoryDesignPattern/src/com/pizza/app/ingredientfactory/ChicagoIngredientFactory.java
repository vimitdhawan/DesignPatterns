package com.pizza.app.ingredientfactory;

import com.pizza.app.dough.Dough;
import com.pizza.app.dough.ThickDough;
import com.pizza.app.sauces.HoneySauce;
import com.pizza.app.sauces.Sauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new HoneySauce();
	}

}
