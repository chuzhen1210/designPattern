package com.factory.pattern.factory;

import com.factory.pattern.ingredient.impl.FreshClams;
import com.factory.pattern.ingredient.impl.Garlic;
import com.factory.pattern.ingredient.impl.MarinaraSauce;
import com.factory.pattern.ingredient.impl.Mushroom;
import com.factory.pattern.ingredient.impl.Onion;
import com.factory.pattern.ingredient.impl.RedPepper;
import com.factory.pattern.ingredient.impl.ReggianoCheese;
import com.factory.pattern.ingredient.impl.SlicedPepperoni;
import com.factory.pattern.ingredient.impl.ThinCrustDough;
import com.factory.pattern.ingredient.intf.Cheese;
import com.factory.pattern.ingredient.intf.Clams;
import com.factory.pattern.ingredient.intf.Dough;
import com.factory.pattern.ingredient.intf.Pepperoni;
import com.factory.pattern.ingredient.intf.Sauce;
import com.factory.pattern.ingredient.intf.Veggies;
import com.factory.pattern.intf.PizzaIngredientFactory;

/**
 * 纽约原料工厂
 * @author chuzhen
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
