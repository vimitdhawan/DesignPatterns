package com.duck.app.types;

import com.duck.app.quack.behaviour.SqueakSound;
import com.duck.app.flying.behaviour.FlyWithoutWings;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehaviour = new FlyWithoutWings();
		quackBehaviour = new SqueakSound();
	}

	@Override
	public void display() {
		System.out.println("Rubber Duck");

	}

}
