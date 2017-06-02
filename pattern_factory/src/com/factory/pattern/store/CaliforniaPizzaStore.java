package com.factory.pattern.store;

import com.factory.pattern.impl.CaliforniaStyleCheesePizza;
import com.factory.pattern.impl.CaliforniaStyleClamPizza;
import com.factory.pattern.impl.CaliforniaStylePepperoniPizza;
import com.factory.pattern.impl.CaliforniaStyleVeggiePizza;
import com.factory.pattern.intf.APizzaStore;
import com.factory.pattern.intf.Pizza;

/**
 * ¼ÓÀû¸£ÄáÑÇÅûÈøµê
 * @author chuzhen
 *
 */
public class CaliforniaPizzaStore extends APizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type)) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if("pepperoni".equals(type)) {
			pizza = new CaliforniaStylePepperoniPizza();
		} else if("clam".equals(type)) {
			pizza = new CaliforniaStyleClamPizza();
		} else if("veggie".equals(type)) {
			pizza = new CaliforniaStyleVeggiePizza();
		}
		
		return pizza;
	}

}
