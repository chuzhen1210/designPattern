package com.factory.pattern.store;

import com.factory.pattern.factory.SimplePizzaFactory;
import com.factory.pattern.intf.Pizza;

/**
 * �򵥹���ģʽ��������-�������̵�Ĺ�������
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
