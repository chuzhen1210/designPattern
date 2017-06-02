package com.decorator.pattern.impl;

import com.decorator.pattern.intf.Beverage;

public class Decaf extends Beverage {

	public Decaf(Size size) {
		super(size);
		this.description = "�Ϳ�����";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
