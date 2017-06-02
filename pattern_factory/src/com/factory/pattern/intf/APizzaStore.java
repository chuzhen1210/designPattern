package com.factory.pattern.intf;


/**
 * 抽象创建者类<br>
 * 抽象披萨店-披萨由具体地域的披萨加盟店生产（覆盖工厂方法）
 * @author chuzhen
 *
 */
public abstract class APizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	/**
	 * 工厂方法
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
