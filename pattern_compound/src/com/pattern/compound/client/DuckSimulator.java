package com.pattern.compound.client;

import com.pattern.compound.adapter.GooseAdapter;
import com.pattern.compound.decorator.QuackCounter;
import com.pattern.compound.factory.AbstractDuckFactory;
import com.pattern.compound.factory.CountingDuckFactory;
import com.pattern.compound.impl.honker.Goose;
import com.pattern.compound.impl.quacker.DuckCall;
import com.pattern.compound.impl.quacker.Flock;
import com.pattern.compound.impl.quacker.MallardDuck;
import com.pattern.compound.impl.quacker.Quackologist;
import com.pattern.compound.impl.quacker.RedheadDuck;
import com.pattern.compound.impl.quacker.RubberDuck;
import com.pattern.compound.intf.Quackable;

/**
 * 鸭子模拟器
 * @author chuzhen
 *
 */
public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulateObserver(duckFactory);
	}
	
	/**
	 * 观察者模式
	 * @param duckFactory
	 */
	void simulateObserver(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		GooseAdapter gooseDuck = new GooseAdapter(new Goose());
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Quackable mallard1 = duckFactory.createMallardDuck();
		Quackable mallard2 = duckFactory.createMallardDuck();
		Quackable mallard3 = duckFactory.createMallardDuck();
		Quackable mallard4 = duckFactory.createMallardDuck();
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(mallard1);
		flockOfMallards.add(mallard2);
		flockOfMallards.add(mallard3);
		flockOfMallards.add(mallard4);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator：With Observer");
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	/**
	 * 组合模式
	 * @param duckFactory
	 */
	void simulateComposite(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		GooseAdapter gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator：With Composite-Flocks");
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Quackable mallard1 = duckFactory.createMallardDuck();
		Quackable mallard2 = duckFactory.createMallardDuck();
		Quackable mallard3 = duckFactory.createMallardDuck();
		Quackable mallard4 = duckFactory.createMallardDuck();
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(mallard1);
		flockOfMallards.add(mallard2);
		flockOfMallards.add(mallard3);
		flockOfMallards.add(mallard4);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simulator: Mallord Flock Simulation");
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	/**
	 * 工厂模式
	 * @param duckFactory
	 */
	void simulateFactory(AbstractDuckFactory duckFactory) {
		
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		GooseAdapter gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Abstract Factory");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	/**
	 * 装饰者模式
	 */
	void simulateDecorator() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
		
		System.out.println("\nDuck Simulator: With Decorator");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Goose Adapter");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
