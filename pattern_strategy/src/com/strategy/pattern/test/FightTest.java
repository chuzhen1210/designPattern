package com.strategy.pattern.test;

import com.strategy.pattern.actor.impl.Queen;
import com.strategy.pattern.intf.Character;
import com.strategy.pattern.weapon.impl.AxeBehavior;

public class FightTest {

	public static void main(String[] args) {
		Character acter = new Queen();
		acter.fight();
		
		acter.setWeapon(new AxeBehavior());
		acter.fight();
	}
}
