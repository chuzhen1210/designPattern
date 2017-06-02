package com.factory.pattern.store;

import com.factory.pattern.impl.ChicagoStyleCheesePizza;
import com.factory.pattern.impl.ChicagoStyleClamPizza;
import com.factory.pattern.impl.ChicagoStylePepperoniPizza;
import com.factory.pattern.impl.ChicagoStyleVeggiePizza;
import com.factory.pattern.intf.APizzaStore;
import com.factory.pattern.intf.Pizza;

/**
 * Ö¥¼Ó¸çÅûÈøµê
 * @author chuzhen
 *
 */
public class ChicagoPizzaStore extends APizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if("cheese".equals(type)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if("pepperoni".equals(type)) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if("clam".equals(type)) {
			pizza = new ChicagoStyleClamPizza();
		} else if("veggie".equals(type)) {
			pizza = new ChicagoStyleVeggiePizza();
		}
				
		return pizza;
	}

}
