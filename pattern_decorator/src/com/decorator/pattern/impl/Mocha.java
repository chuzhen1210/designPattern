package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;
import com.decorator.pattern.intf.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Ä¦¿¨";
	}

	@Override
	public double cost() {
		return 0.20 + this.beverage.cost();
	}

}
