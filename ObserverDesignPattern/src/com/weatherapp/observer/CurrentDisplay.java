package com.weatherapp.observer;

import com.weatherapp.subject.Subject;

public class CurrentDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
		
	}

	@Override
	public void display() {
		System.out.println("tempratere" + this.temp + "pressure" + this.pressure + "humidity"+ this.humidity);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

}
