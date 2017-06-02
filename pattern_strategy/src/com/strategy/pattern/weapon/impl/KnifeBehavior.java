package com.strategy.pattern.weapon.impl;

import com.strategy.pattern.intf.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Ê¹ÓÃØ°Ê×´ÌÉ±£¡");
	}

}
