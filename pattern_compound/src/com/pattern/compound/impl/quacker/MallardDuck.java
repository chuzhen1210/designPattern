package com.pattern.compound.impl.quacker;

import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * 标准的绿头鸭
 * @author chuzhen
 *
 */
public class MallardDuck implements Quackable {
	
	private Observable observable;

	public MallardDuck() {
		super();
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("MallardDuck, Quack");
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
