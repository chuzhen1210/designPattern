package com.pattern.compound.impl.quacker;

import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * ÏðÆ¤Ñ¼×Ó
 * @author chuzhen
 *
 */
public class RubberDuck implements Quackable {

	private Observable observable;
	
	public RubberDuck() {
		super();
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("RubberDuck, Squeak");
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
