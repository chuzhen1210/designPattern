package com.observer.pattern.impl;

import com.observer.pattern.intf.DisplayElement;
import com.observer.pattern.intf.Observer;
import com.observer.pattern.intf.Subject;

/**
 * Ŀǰ״�������<br>
 * �˲�������WeatherData������ʾ��ǰ�۲�ֵ
 * @author chuzhen
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + this.temperature + "F degrees and "
				+ this.humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float presure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
