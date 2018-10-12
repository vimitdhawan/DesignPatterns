package com.adapter.app.duckapp;

public class MallardDuck implements Duck {

	@Override
	public void fly() {
		System.out.println("mallard duck fly");

	}

	@Override
	public void quack() {
		System.out.println("mallard duck quack");

	}

	@Override
	public void swim() {
		System.out.println("mallad duck swimming");
		
	}

}
