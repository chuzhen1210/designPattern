package com.factory.pattern.store;

import com.factory.pattern.impl.NYStyleCheesePizza;
import com.factory.pattern.impl.NYStyleClamPizza;
import com.factory.pattern.impl.NYStylePepperoniPizza;
import com.factory.pattern.impl.NYStyleVeggiePizza;
import com.factory.pattern.intf.APizzaStore;
import com.factory.pattern.intf.Pizza;

/**
 * Å¦Ô¼ÅûÈøµê
 * @author chuzhen
 *
 */
public class NYPizzaStore extends APizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
	
		if("cheese".equals(type)) {
			pizza = new NYStyleCheesePizza();
		} else if("pepperoni".equals(type)) {
			pizza = new NYStylePepperoniPizza();
		} else if("clam".equals(type)) {
			pizza = new NYStyleClamPizza();
		} else if("veggie".equals(type)) {
			pizza = new NYStyleVeggiePizza();
		}
				
		return pizza;
	}

}
