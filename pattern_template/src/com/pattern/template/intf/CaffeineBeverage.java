package com.pattern.template.intf;

public abstract class CaffeineBeverage {

	/**
	 * ģ�巽��������Ϊfinal����������ı��㷨��˳��
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
