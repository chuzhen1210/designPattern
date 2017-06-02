package com.factory.pattern.pizza.impl;

import com.factory.pattern.intf.Pizza;
import com.factory.pattern.intf.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

}
