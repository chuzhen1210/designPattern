package com.pattern.compound.adapter;

import com.pattern.compound.impl.honker.Goose;
import com.pattern.compound.impl.quacker.Observable;
import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * �������������һ���Ѵ�������Quackable�ӿ�
 * <p style='color:red'>ʵ��Ŀ��ӿ�
 * @author chuzhen
 *
 */
public class GooseAdapter implements Quackable {

	private Goose goose;
	private Observable observable;
	
	/**
	 * ������������Ҫ����Ķ���
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		super();
		this.goose = goose;
		
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		//������quackʱ���ᱻί�е����honk()����
		goose.honk();
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		this.observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}

}
