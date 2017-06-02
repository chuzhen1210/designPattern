package com.strategy.pattern.actor.impl;

import com.strategy.pattern.intf.Character;
import com.strategy.pattern.weapon.impl.SwordBehavior;

public class King extends Character {

	public King() {
		this.weapon = new SwordBehavior();
	}
	
	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

}
