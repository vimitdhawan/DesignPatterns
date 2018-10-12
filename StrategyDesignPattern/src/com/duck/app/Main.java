package com.duck.app;

import com.duck.app.flying.behaviour.FlyWithoutWings;
import com.duck.app.types.Duck;
import com.duck.app.types.RedHeadDuck;
import com.duck.app.types.RubberDuck;

public class Main {

	public static void main(String[] args) {
		
		Duck redDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();
		redDuck.fly();
		redDuck.setFlyBehaviour(new FlyWithoutWings());
		redDuck.fly();
		
		

	}

}
