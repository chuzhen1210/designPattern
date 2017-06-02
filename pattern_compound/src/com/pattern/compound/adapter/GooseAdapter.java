package com.pattern.compound.adapter;

import com.pattern.compound.impl.honker.Goose;
import com.pattern.compound.impl.quacker.Observable;
import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * 大鹅适配器，可一个把大鹅适配成Quackable接口
 * <p style='color:red'>实现目标接口
 * @author chuzhen
 *
 */
public class GooseAdapter implements Quackable {

	private Goose goose;
	private Observable observable;
	
	/**
	 * 构造器传入需要适配的对象
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		super();
		this.goose = goose;
		
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		//当调用quack时，会被委托到鹅的honk()方法
		goose.honk();
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		this.observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}

}
