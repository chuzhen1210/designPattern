package com.observer.pattern.intf;

/**
 * 观察者接口，主题的依赖着<br>
 * 所有的观察者都必须实现update()方法，以实现观察者接口。
 * 
 * @author chuzhen
 *
 */
public interface Observer {

	/**
	 * 当气象观测值改变时，主题会把这些这些状态值当作方法的参数，传递给观察者
	 * @param temperature
	 * @param humidity
	 * @param presure
	 */
	public void update(float temperature, float humidity, float presure);
	
}
