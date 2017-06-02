package com.strategy.pattern.weapon.impl;

import com.strategy.pattern.intf.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("ʹ�ø�ͷ������");
	}

}
