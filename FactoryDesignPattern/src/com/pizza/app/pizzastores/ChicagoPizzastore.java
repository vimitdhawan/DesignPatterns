package com.pizza.app.pizzastores;

import com.pizza.app.ingredientfactory.ChicagoIngredientFactory;
import com.pizza.app.types.ChicagoStyleCheesePizza;
import com.pizza.app.types.ChicagoStylePepperoniPizza;
import com.pizza.app.types.Pizza;

public class ChicagoPizzastore extends PizzaStore{
	
	Pizza pizza;

	@Override
	public Pizza createPizza(String type) {
		if(type=="cheese"){
			pizza = new ChicagoStyleCheesePizza(new ChicagoIngredientFactory());
		} else if(type=="pepperconi"){
			pizza = new ChicagoStylePepperoniPizza(new ChicagoIngredientFactory());
		}
		return pizza;
	}

}
