package com.factory.pattern.factory;

import com.factory.pattern.ingredient.impl.BlackOlives;
import com.factory.pattern.ingredient.impl.Eggplant;
import com.factory.pattern.ingredient.impl.FrozenClams;
import com.factory.pattern.ingredient.impl.Garlic;
import com.factory.pattern.ingredient.impl.MozzarellaCheese;
import com.factory.pattern.ingredient.impl.Mushroom;
import com.factory.pattern.ingredient.impl.Onion;
import com.factory.pattern.ingredient.impl.PlumTomatoSauce;
import com.factory.pattern.ingredient.impl.RedPepper;
import com.factory.pattern.ingredient.impl.SlicedPepperoni;
import com.factory.pattern.ingredient.impl.Spinach;
import com.factory.pattern.ingredient.impl.ThickCrustDough;
import com.factory.pattern.ingredient.intf.Cheese;
import com.factory.pattern.ingredient.intf.Clams;
import com.factory.pattern.ingredient.intf.Dough;
import com.factory.pattern.ingredient.intf.Pepperoni;
import com.factory.pattern.ingredient.intf.Sauce;
import com.factory.pattern.ingredient.intf.Veggies;
import com.factory.pattern.intf.PizzaIngredientFactory;

/**
 * 芝加哥原料工厂
 * @author chuzhen
 *
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new BlackOlives(), new Spinach(), new Eggplant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
