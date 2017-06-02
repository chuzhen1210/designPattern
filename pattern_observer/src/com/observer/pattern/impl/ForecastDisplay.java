package com.observer.pattern.impl;

import com.observer.pattern.intf.DisplayElement;
import com.observer.pattern.intf.Observer;

/**
 * 预测布告板<br>
 * 此布告板根据气压计显示天气预报
 * @author chuzhen
 *
 */
public class ForecastDisplay implements Observer, DisplayElement {

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(float temperature, float humidity, float presure) {
		// TODO Auto-generated method stub

	}

}
