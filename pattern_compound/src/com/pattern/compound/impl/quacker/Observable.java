package com.pattern.compound.impl.quacker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pattern.compound.intf.QuackObservable;
import com.pattern.compound.intf.QuackObserver;

/**
 * ∏®÷˙¿‡
 * @author chuzhen
 *
 */
public class Observable implements QuackObservable {
	
	private List<QuackObserver> observers = new ArrayList<QuackObserver>();
	private QuackObservable duck;

	public Observable(QuackObservable duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<QuackObserver> iterator = observers.iterator();
		while(iterator.hasNext()) {
			QuackObserver observer = iterator.next();
			observer.update(duck);
		}
	}

}
