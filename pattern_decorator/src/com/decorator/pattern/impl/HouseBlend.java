package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(Size size) {
		super(size);
		this.description = "вш╨о";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
