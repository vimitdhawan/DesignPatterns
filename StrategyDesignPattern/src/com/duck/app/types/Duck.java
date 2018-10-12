package com.duck.app.types;

import com.duck.app.quack.behaviour.QuackBehaviour;
import com.duck.app.flying.behaviour.FlyBehaviour;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public void fly(){
		flyBehaviour.fly();
	}
	
	public void quack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("swimming");
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour){
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuakBehaviour(QuackBehaviour quackBehaviour){
		this.quackBehaviour = quackBehaviour;
	}
	
	public abstract void display();

}
