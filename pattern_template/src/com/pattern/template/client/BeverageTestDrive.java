package com.pattern.template.client;

import com.pattern.template.impl.CoffeeWithHook;
import com.pattern.template.impl.TeaWithHook;

public class BeverageTestDrive {

	public static void main(String[] args) {
		
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("Making tea...");
		teaHook.prepareRecipe();
		
		System.out.println("Making coffee...");
		coffeeHook.prepareRecipe();
	}

}
