package com.factory.pattern.intf;

import com.factory.pattern.ingredient.intf.Cheese;
import com.factory.pattern.ingredient.intf.Clams;
import com.factory.pattern.ingredient.intf.Dough;
import com.factory.pattern.ingredient.intf.Pepperoni;
import com.factory.pattern.ingredient.intf.Sauce;
import com.factory.pattern.ingredient.intf.Veggies;

/**
 * ≈˚»¯≥ÈœÛ¿‡
 * @author chuzhen
 *
 */
public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;
	
	protected abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
