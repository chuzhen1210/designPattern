package com.strategy.pattern.actor.impl;

import com.strategy.pattern.intf.Character;
import com.strategy.pattern.weapon.impl.BowAndArrowBehavior;

public class Knight extends Character {

	public Knight() {
		this.weapon = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

}
