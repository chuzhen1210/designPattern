package com.factory.pattern.intf;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected List toppings = new ArrayList();

	public void prepare() {
		System.out.println("preparing " + name);
		System.out.println("tossing dough... ");
		System.out.println("adding sauce... ");
		
		System.out.println("adding toppings: ");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("\t" + toppings.get(i));
		}
	}

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
		return this.name;
	}
	
}
