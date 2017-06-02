package com.observer.pattern.impl;

import java.util.ArrayList;
import java.util.List;

import com.observer.pattern.intf.Observer;
import com.observer.pattern.intf.Subject;

/**
 * 天气情况数据对象
 * @author chuzhen
 *
 */
public class WeatherData implements Subject {
	
	private List<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		super();
		observers = new ArrayList<Observer>();
	}

	public WeatherData(float temperature, float humidity, float pressure) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		this.observers = new ArrayList<Observer>();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = (temperature);
		this.humidity = (humidity);
		this.pressure = (pressure);
		//通知观察者状态变化
		this.measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(this.getTemperature(), this.getHumidity(), this.getPressure());
		}
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
}
