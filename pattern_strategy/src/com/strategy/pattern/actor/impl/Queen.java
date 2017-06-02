package com.strategy.pattern.actor.impl;

import com.strategy.pattern.intf.Character;
import com.strategy.pattern.weapon.impl.KnifeBehavior;

public class Queen extends Character {

	public Queen() {
		this.weapon = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

}
