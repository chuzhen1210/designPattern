package com.pattern.compound.factory;

import com.pattern.compound.decorator.QuackCounter;
import com.pattern.compound.impl.quacker.DuckCall;
import com.pattern.compound.impl.quacker.MallardDuck;
import com.pattern.compound.impl.quacker.RedheadDuck;
import com.pattern.compound.impl.quacker.RubberDuck;
import com.pattern.compound.intf.Quackable;

/**
 * �˹���������������ӵ�м�����Ϊ��װ���ߣ�װ�ι���Ѽ��
 * @author chuzhen
 *
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
