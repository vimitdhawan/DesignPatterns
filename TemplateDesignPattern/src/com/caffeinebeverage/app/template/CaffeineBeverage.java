package com.caffeinebeverage.app.template;

public abstract class CaffeineBeverage {
	
	public final void prepareBeverage(){
		
		boilWater();
		
		brew();
		
		pourInCup();
		
		if (isAddCondiments()) {
			addCondiments();
		}
		
		
		
	}

	public boolean isAddCondiments() {
		return true;
	}

	private void pourInCup() {
		System.out.println("pour drink in cup");
		
	}

	private void boilWater() {
		System.out.println("add boiling water");
		
	}
	
	protected abstract void addCondiments();
	
	public abstract void brew();

}
