package com.factory.pattern.factory;

import com.factory.pattern.impl.CheesePizza;
import com.factory.pattern.impl.ClamPizza;
import com.factory.pattern.impl.PepperoniPizza;
import com.factory.pattern.impl.VeggiePizza;
import com.factory.pattern.intf.Pizza;

/**
 * ¼òµ¥¹¤³§
 * @author chuzhen
 *
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		} else if("clam".equals(type)) {
			pizza = new ClamPizza();
		} else if("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
