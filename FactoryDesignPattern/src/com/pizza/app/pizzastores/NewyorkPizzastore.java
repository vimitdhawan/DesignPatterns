package com.pizza.app.pizzastores;

import com.pizza.app.ingredientfactory.NewyorkPizzaIngredentFactory;
import com.pizza.app.types.NyStyleCheesePizza;
import com.pizza.app.types.NyStylePepperoniPizza;
import com.pizza.app.types.Pizza;

public class NewyorkPizzastore extends PizzaStore{
	Pizza pizza;

	@Override
	public Pizza createPizza(String type) {
		if(type=="cheese"){
			pizza = new NyStyleCheesePizza(new NewyorkPizzaIngredentFactory());
		} else if(type=="pepperconi"){
			pizza = new NyStylePepperoniPizza(new NewyorkPizzaIngredentFactory());
		}
		return pizza;
	}

}
