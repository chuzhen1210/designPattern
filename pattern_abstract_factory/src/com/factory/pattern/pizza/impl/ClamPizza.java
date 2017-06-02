package com.factory.pattern.pizza.impl;

import com.factory.pattern.intf.Pizza;
import com.factory.pattern.intf.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + name);
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();
		this.clam = this.ingredientFactory.createClam();
	}

}
