package com.pattern.template.intf;

public abstract class CaffeineBeverageWithHook {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}

	protected abstract void brew();
	protected abstract void addCondiments();
	
	private void boilWater() {
		System.out.println("Boiling water");
	}
	
	private void pourInCup() {
		System.out.println("Pouting into cup");
	}

	/**
	 * 这是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做
	 * @return
	 */
	protected boolean customerWantsCondiments() {
		return true;
	}

}
