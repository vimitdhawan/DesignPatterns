package com.pizza.app;

import com.pizza.app.pizzastores.ChicagoPizzastore;
import com.pizza.app.pizzastores.NewyorkPizzastore;
import com.pizza.app.pizzastores.PizzaStore;

public class Main {
	public static void main(String args[]) {
		
		PizzaStore newyorkStore = new NewyorkPizzastore();
		newyorkStore.orderPizza("cheese");
		
		PizzaStore chicagoStore = new ChicagoPizzastore();
		chicagoStore.orderPizza("pepperconi");
	}

}
