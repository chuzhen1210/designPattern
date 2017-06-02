package com.pattern.template.impl;

import com.pattern.template.intf.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

	@Override
	protected void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
