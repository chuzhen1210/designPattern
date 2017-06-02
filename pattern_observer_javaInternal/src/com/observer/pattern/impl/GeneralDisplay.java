package com.observer.pattern.impl;

import java.util.Observable;
import java.util.Observer;

import com.observer.pattern.intf.DisplayElement;

public class GeneralDisplay implements DisplayElement, Observer {

	private Observable observable;
	private float temperature;
	private float humidity;
	
	public GeneralDisplay(Observable observable) {
		super();
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature + "F degrees and "
				+ humidity + "% humidity");
	}

}
