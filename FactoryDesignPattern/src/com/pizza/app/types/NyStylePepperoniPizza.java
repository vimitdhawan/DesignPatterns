package com.pizza.app.types;

import com.pizza.app.ingredientfactory.PizzaIngredientFactory;

public class NyStylePepperoniPizza extends Pizza{
	public NyStylePepperoniPizza(PizzaIngredientFactory pizzaIngredintFactory){
		this.ingredientFactory = pizzaIngredintFactory;
		name="Newyork Style Pepperoni Pizza";
		
	}

	@Override
	public void prepare() {
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		
	}

}
