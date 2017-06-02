package com.pattern.compound.impl.honker;

import com.pattern.compound.intf.Honkable;

/**
 * 步行街神兽-大鹅
 * @author chuzhen
 *
 */
public class Goose implements Honkable {

	@Override
	public void honk() {
		System.out.println("Goose, Honk");
	}

}
