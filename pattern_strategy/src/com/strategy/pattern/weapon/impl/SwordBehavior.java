package com.strategy.pattern.weapon.impl;

import com.strategy.pattern.intf.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("ʹ�ñ������裡");
	}

}
