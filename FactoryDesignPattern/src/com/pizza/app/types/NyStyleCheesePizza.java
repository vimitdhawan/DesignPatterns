package com.pizza.app.types;

import com.pizza.app.ingredientfactory.PizzaIngredientFactory;

public class NyStyleCheesePizza extends Pizza{
	
	public NyStyleCheesePizza(PizzaIngredientFactory pizzaIngredintFactory){
		name="Newyork Style Cheese Pizza";
		this.ingredientFactory = pizzaIngredintFactory;
	}

	@Override
	public void prepare() {
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		
	}
	
	

}
