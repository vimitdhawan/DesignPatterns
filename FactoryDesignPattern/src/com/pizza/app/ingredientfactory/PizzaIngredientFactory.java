package com.pizza.app.ingredientfactory;

import com.pizza.app.dough.Dough;
import com.pizza.app.sauces.Sauce;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	

}
