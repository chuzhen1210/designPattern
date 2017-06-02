package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;

public class Espresso extends Beverage {

	public Espresso(Size size) {
		super(size);
		this.description = "Å¨¿§·È";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
