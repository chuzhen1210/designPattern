package com.pattern.compound.factory;

import com.pattern.compound.intf.Quackable;

/**
 * 需要一些质量控制来确保鸭子一定是被包装起来的。我们要建造一个工厂，创建装饰过的鸭子。
 * 此工厂应该生产各种不同类型的鸭子的产品家族。所以利用抽象工厂模式。
 * @author chuzhen
 *
 */
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
	
}
