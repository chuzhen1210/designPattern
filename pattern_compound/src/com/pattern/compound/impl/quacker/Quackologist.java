package com.pattern.compound.impl.quacker;

import com.pattern.compound.intf.QuackObservable;
import com.pattern.compound.intf.QuackObserver;

/**
 * ßÉßÉ½ÐÑ§¼Ò
 * @author chuzhen
 *
 */
public class Quackologist implements QuackObserver {

	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist£º" + duck + " just quacked.");
	}

}
