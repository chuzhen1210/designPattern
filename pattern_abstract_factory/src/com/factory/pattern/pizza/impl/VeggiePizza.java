package com.factory.pattern.pizza.impl;

import com.factory.pattern.intf.Pizza;
import com.factory.pattern.intf.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

}
