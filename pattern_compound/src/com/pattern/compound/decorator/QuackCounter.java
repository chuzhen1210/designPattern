package com.pattern.compound.decorator;

import com.pattern.compound.impl.quacker.Observable;
import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * �������ɽе�װ���ߣ���Ѽ�Ӱ�װ��װ���߶��󣬸�Ѽ��һЩ����Ϊ�������������Ϊ����
 * �Ӷ������޸�Ѽ�ӵĴ���
 * @author chuzhen
 *
 */
public class QuackCounter implements Quackable {

	private Quackable duck;//��ʵ��������¼��װ�ε����ɽ���
	
	static int numberOfQuacks;//�þ�̬���������������ɽд������������ɽ�װ���߹���˱���
	
	public QuackCounter(Quackable duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void quack() {
		this.duck.quack();
		numberOfQuacks ++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		this.duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		//TODO
		
//		this.duck.notifyObservers();
	}

}
