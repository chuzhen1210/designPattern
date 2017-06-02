package com.pattern.compound.intf;

/**
 * 呱呱叫观察者，只需要一个<code>update()</code>方法
 * @author chuzhen
 *
 */
public interface QuackObserver {

	/**
	 * 需要传入被观察对象
	 * @param duck
	 */
	public void update(QuackObservable duck);
}
