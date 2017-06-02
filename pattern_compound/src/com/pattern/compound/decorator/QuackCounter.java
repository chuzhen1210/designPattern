package com.pattern.compound.decorator;

import com.pattern.compound.impl.quacker.Observable;
import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * 创建呱呱叫的装饰者，把鸭子包装进装饰者对象，给鸭子一些新行为（计算次数的行为）。
 * 从而不必修改鸭子的代码
 * @author chuzhen
 *
 */
public class QuackCounter implements Quackable {

	private Quackable duck;//用实例变量记录被装饰的呱呱叫者
	
	static int numberOfQuacks;//用静态变量跟踪所有呱呱叫次数，所有呱呱叫装饰者共享此变量
	
	public QuackCounter(Quackable duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void quack() {
		this.duck.quack();
		numberOfQuacks ++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		this.duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		//TODO
		
//		this.duck.notifyObservers();
	}

}
