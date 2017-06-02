package com.pattern.compound.impl.honker;

import com.pattern.compound.intf.Honkable;

/**
 * ���н�����-���
 * @author chuzhen
 *
 */
public class Goose implements Honkable {

	@Override
	public void honk() {
		System.out.println("Goose, Honk");
	}

}
