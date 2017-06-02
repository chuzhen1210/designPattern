package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;
import com.decorator.pattern.intf.CondimentDecorator;

public class Whip extends CondimentDecorator {

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", длещ";
	}

	@Override
	public double cost() {
		return 0.10 + this.beverage.cost();
	}

}
