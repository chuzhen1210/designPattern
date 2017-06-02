package com.strategy.pattern.actor.impl;

import com.strategy.pattern.intf.Character;
import com.strategy.pattern.weapon.impl.AxeBehavior;

public class Troll extends Character {

	public Troll() {
		this.weapon = new AxeBehavior();
	}
	
	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

}
