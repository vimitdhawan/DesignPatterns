package com.adapter.app.adapter;

import com.adapter.app.adaptee.turkey.Turkey;
import com.adapter.app.duckapp.Duck;

public class Adapter implements Duck {
	Turkey turkey;
	
	public Adapter(Turkey turkey) {
		this.turkey = turkey;
		
	}

	@Override
	public void fly() {
		turkey.fly();
		
	}

	@Override
	public void quack() {
		turkey.gobble();
		
	}

	@Override
	public void swim() {
		throw new RuntimeException();
		
	}

}
