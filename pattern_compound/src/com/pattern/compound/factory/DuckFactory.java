package com.pattern.compound.factory;

import com.pattern.compound.impl.quacker.DuckCall;
import com.pattern.compound.impl.quacker.MallardDuck;
import com.pattern.compound.impl.quacker.RedheadDuck;
import com.pattern.compound.impl.quacker.RubberDuck;
import com.pattern.compound.intf.Quackable;

/**
 * 此工厂用来生产没有装饰过的鸭子
 * @author chuzhen
 *
 */
public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
