package com.factory.pattern.intf;


/**
 * ���󴴽�����<br>
 * ����������-�����ɾ��������������˵����������ǹ���������
 * @author chuzhen
 *
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	/**
	 * ��������
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
