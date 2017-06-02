package com.pattern.compound.intf;

/**
 * <p>这是一个接口，任何想被观察的Quackable都必须实现该接口
 * <p>需要注册和通知观察者的方法
 * <p>通常也需要删除观察者的方法，但是在这里为了让实现变得简单，就省略了
 * @author chuzhen
 *
 */
public interface QuackObservable {

	public void registerObserver(QuackObserver observer);
	public void notifyObservers();
}
