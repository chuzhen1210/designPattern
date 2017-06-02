package com.strategy.pattern.intf;

/**
 * ½ÇÉ«
 * @author chuzhen
 *
 */
public abstract class Character {

	protected WeaponBehavior weapon;
	
	public void fight() {
		this.weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
