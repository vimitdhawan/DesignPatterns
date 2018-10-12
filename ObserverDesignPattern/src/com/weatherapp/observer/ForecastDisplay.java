package com.weatherapp.observer;

import com.weatherapp.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private Subject weatherData;
	private float temp;
	private float humidity;
	private float pressure;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
		
	}
	
	public ForecastDisplay() {
		
	}
	

	@Override
	public void display() {
		if (this.temp> 50){
			System.out.println("Forecasting");
		} else {
			System.out.println("no forecasting");
		}
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

}
