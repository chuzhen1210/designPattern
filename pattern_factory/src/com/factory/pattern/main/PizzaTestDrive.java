package com.factory.pattern.main;

import com.factory.pattern.intf.APizzaStore;
import com.factory.pattern.intf.Pizza;
import com.factory.pattern.store.ChicagoPizzaStore;
import com.factory.pattern.store.NYPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		APizzaStore nyStore = new NYPizzaStore();
		APizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
