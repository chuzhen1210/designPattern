package com.decorator.pattern.main;

import com.decorator.pattern.impl.DarkRoast;
import com.decorator.pattern.impl.Espresso;
import com.decorator.pattern.impl.HouseBlend;
import com.decorator.pattern.impl.Mocha;
import com.decorator.pattern.impl.Soy;
import com.decorator.pattern.impl.Whip;
import com.decorator.pattern.intf.Beverage;
import com.decorator.pattern.intf.Beverage.Size;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage espresso = new Espresso(Size.GRANDE);
		System.out.println(espresso.getDescription() + " $" + espresso.cost());
		
		Beverage darkRoast = new DarkRoast(Size.GRANDE);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
		
		Beverage houseBlend = new HouseBlend(Size.GRANDE);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
		
	}
	
}
