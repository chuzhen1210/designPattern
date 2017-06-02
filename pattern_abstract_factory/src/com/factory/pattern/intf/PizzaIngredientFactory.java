package com.factory.pattern.intf;

import com.factory.pattern.ingredient.intf.Cheese;
import com.factory.pattern.ingredient.intf.Clams;
import com.factory.pattern.ingredient.intf.Dough;
import com.factory.pattern.ingredient.intf.Pepperoni;
import com.factory.pattern.ingredient.intf.Sauce;
import com.factory.pattern.ingredient.intf.Veggies;

/**
 * 披萨原料工厂接口
 * <p>
 * 如果每个工厂实例内都有某一种通用的“机制”需要实现，可以考虑把该接口修改成抽象类
 * </P>
 * @author chuzhen
 *
 */
public interface PizzaIngredientFactory {

	public Dough createDough();
	
	public Sauce createSauce();
	
	public Cheese createCheese();
	
	public Veggies[] createVeggies();
	
	public Pepperoni createPepperoni();
	
	public Clams createClam();
	
}
