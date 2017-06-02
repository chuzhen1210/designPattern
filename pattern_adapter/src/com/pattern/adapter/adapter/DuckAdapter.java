package com.pattern.adapter.adapter;

import java.util.Random;

import com.pattern.adapter.intf.Duck;
import com.pattern.adapter.intf.Turkey;

public class DuckAdapter implements Turkey {

	private Duck duck;
	private Random random;
	
	public DuckAdapter(Duck duck) {
		super();
		this.duck = duck;
		this.random = new Random();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if(this.random.nextInt(5) == 0) {
			duck.fly();
		}
	}

}
