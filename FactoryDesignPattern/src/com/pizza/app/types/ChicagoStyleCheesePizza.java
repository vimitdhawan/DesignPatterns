package com.pizza.app.types;

import com.pizza.app.ingredientfactory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredintFactory){
		this.ingredientFactory = pizzaIngredintFactory;
	}

	@Override
	public void prepare() {
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		
	}

}
