package com.factory.pattern.intf;

import com.factory.pattern.ingredient.intf.Cheese;
import com.factory.pattern.ingredient.intf.Clams;
import com.factory.pattern.ingredient.intf.Dough;
import com.factory.pattern.ingredient.intf.Pepperoni;
import com.factory.pattern.ingredient.intf.Sauce;
import com.factory.pattern.ingredient.intf.Veggies;

/**
 * ����ԭ�Ϲ����ӿ�
 * <p>
 * ���ÿ������ʵ���ڶ���ĳһ��ͨ�õġ����ơ���Ҫʵ�֣����Կ��ǰѸýӿ��޸ĳɳ�����
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
