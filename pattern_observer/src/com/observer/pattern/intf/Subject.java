package com.observer.pattern.intf;

/**
 * 主体接口，数据拥有者
 * @author chuzhen
 *
 */
public interface Subject {

	/**
	 * 注册观察者
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * 移除观察者
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * 通知观察者更新数据
	 */
	public void notifyObservers();
	
}
