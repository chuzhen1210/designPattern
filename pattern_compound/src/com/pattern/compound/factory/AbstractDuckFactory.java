package com.pattern.compound.factory;

import com.pattern.compound.intf.Quackable;

/**
 * ��ҪһЩ����������ȷ��Ѽ��һ���Ǳ���װ�����ġ�����Ҫ����һ������������װ�ι���Ѽ�ӡ�
 * �˹���Ӧ���������ֲ�ͬ���͵�Ѽ�ӵĲ�Ʒ���塣�������ó��󹤳�ģʽ��
 * @author chuzhen
 *
 */
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
	
}
