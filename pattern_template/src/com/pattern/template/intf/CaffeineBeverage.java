package com.pattern.template.intf;

public abstract class CaffeineBeverage {

	/**
	 * 模板方法，声明为final，以免子类改变算法的顺序
	 */
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	private void boilWater() {
		System.out.println("Boinling water");
	}

	protected abstract void brew();
	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

}
