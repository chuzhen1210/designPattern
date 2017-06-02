package com.observer.pattern.impl;

import com.observer.pattern.intf.DisplayElement;
import com.observer.pattern.intf.Observer;

/**
 * 统计布告板<br>
 * 此布告板跟踪最小、平均、最大的观测值，并显示他们
 * @author chuzhen
 *
 */
public class StatisticsDisplay implements Observer, DisplayElement {

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(float temperature, float humidity, float presure) {
		// TODO Auto-generated method stub

	}

}
