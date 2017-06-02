package com.pattern.compound.impl.quacker;

import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * ºìÍ·Ñ¼
 * @author chuzhen
 *
 */
public class RedheadDuck implements Quackable {

	private Observable observable;

	public RedheadDuck() {
		super();
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("RedheadDuck, Quack");
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
