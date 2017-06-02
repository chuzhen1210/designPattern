package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast(Size size) {
		super(size);
		this.description = "…Ó±∫";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
