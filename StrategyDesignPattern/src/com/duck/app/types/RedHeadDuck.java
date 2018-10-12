package com.duck.app.types;

import com.duck.app.quack.behaviour.QuackSound;
import com.duck.app.flying.behaviour.FlyWithWings;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck(){
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new QuackSound();
	}

	@Override
	public void display() {
		System.out.println("redHeadDuck");
		
	}

}
