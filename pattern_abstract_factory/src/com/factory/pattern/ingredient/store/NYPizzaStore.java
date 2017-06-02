package com.factory.pattern.ingredient.store;

import com.factory.pattern.factory.NYPizzaIngredientFactory;
import com.factory.pattern.intf.Pizza;
import com.factory.pattern.intf.PizzaIngredientFactory;
import com.factory.pattern.intf.PizzaStore;
import com.factory.pattern.pizza.impl.CheesePizza;
import com.factory.pattern.pizza.impl.ClamPizza;
import com.factory.pattern.pizza.impl.PepperoniPizza;
import com.factory.pattern.pizza.impl.VeggiePizza;

/**
 * Å¦Ô¼ÅûÈøµê
 * @author chuzhen
 *
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if("veggie".equals(type)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if("clam".equals(type)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		
		return pizza;
	}

}
