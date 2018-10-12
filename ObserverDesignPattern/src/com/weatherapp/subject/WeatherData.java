package com.weatherapp.subject;

import java.util.ArrayList;
import java.util.List;

import com.weatherapp.observer.Observer;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index>=0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservre() {
		for(Observer o: observers){
			o.update(this.temperature, this.humidity, this.pressure);
		}

	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservre();
	}

}
