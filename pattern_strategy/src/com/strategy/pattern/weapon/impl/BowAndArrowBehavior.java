package com.strategy.pattern.weapon.impl;

import com.strategy.pattern.intf.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Ê¹ÓÃ¹­¼ıÉä»÷£¡");
	}

}
