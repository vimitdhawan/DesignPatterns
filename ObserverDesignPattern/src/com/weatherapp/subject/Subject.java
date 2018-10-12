package com.weatherapp.subject;

import com.weatherapp.observer.Observer;

public interface Subject {
	
	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservre();
	

}
