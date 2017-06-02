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
	 * ����һ�����ӣ�������Ը��������������������һ��Ҫ��ô��
	 * @return
	 */
	protected boolean customerWantsCondiments() {
		return true;
	}

}
