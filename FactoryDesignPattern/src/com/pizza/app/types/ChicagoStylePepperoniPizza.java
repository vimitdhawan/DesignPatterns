package com.pizza.app.types;

import com.pizza.app.ingredientfactory.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends Pizza{
	public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
		name="Chicago Style Pepperoni Pizza";
		this.ingredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		
	}

}
