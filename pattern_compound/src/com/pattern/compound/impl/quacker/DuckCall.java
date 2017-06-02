package com.pattern.compound.impl.quacker;

import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

public class DuckCall implements Quackable {

	private Observable observable;
	
	public DuckCall() {
		super();
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("DuckCall, Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
