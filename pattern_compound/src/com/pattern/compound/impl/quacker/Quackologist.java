package com.pattern.compound.impl.quacker;

import com.pattern.compound.intf.QuackObservable;
import com.pattern.compound.intf.QuackObserver;

/**
 * ���ɽ�ѧ��
 * @author chuzhen
 *
 */
public class Quackologist implements QuackObserver {

	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist��" + duck + " just quacked.");
	}

}
