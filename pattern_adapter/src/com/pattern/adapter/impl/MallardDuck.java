package com.pattern.adapter.impl;

import com.pattern.adapter.intf.Duck;

/**
 * ��ͷѼ
 * @author chuzhen
 *
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {

		System.out.println("I'm flying");
	}

}
