package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;
import com.decorator.pattern.intf.CondimentDecorator;

public class Milk extends CondimentDecorator {

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", еёдл";
	}

	@Override
	public double cost() {
		return 0.10 + this.beverage.cost();
	}

}
