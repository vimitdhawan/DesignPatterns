package com.adapter.app.adaptee.turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("wild turkey globble");

	}

	@Override
	public void fly() {
		System.out.println("wild turkey fly low");

	}

}
