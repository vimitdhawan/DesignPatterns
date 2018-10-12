package com.adapter.app;

import com.adapter.app.adaptee.turkey.Turkey;
import com.adapter.app.adaptee.turkey.WildTurkey;
import com.adapter.app.adapter.Adapter;

public class Main {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Adapter adapter = new Adapter(turkey);
		adapter.fly();
		adapter.quack();
		// adapter.swim();

	}

}
