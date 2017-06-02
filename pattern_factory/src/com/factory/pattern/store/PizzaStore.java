package com.factory.pattern.store;

import com.factory.pattern.factory.SimplePizzaFactory;
import com.factory.pattern.intf.Pizza;

/**
 * 简单工厂模式的披萨店-披萨由商店的工厂生产
 * @author chuzhen
 *
 */
public class PizzaStore {

	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
