package com.observer.pattern.main;

import com.observer.pattern.impl.GeneralDisplay;
import com.observer.pattern.impl.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
