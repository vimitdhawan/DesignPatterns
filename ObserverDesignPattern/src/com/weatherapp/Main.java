package com.weatherapp;

import com.weatherapp.observer.CurrentDisplay;
import com.weatherapp.observer.ForecastDisplay;
import com.weatherapp.subject.WeatherData;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(10f, 26f, 90f);

	}

}
