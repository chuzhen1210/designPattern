package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;
import com.decorator.pattern.intf.CondimentDecorator;

public class Soy extends CondimentDecorator {

	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", ¶¹½¬";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if(getSize() == Size.TALL) {
			cost += 0.10;
		} else if(getSize() == Size.GRANDE) {
			cost += 0.15;
		} else if(getSize() == Size.VENTI) {
			cost += 0.20;
		}
		return cost;
	}

}
