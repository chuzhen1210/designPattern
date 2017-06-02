package com.pattern.state.impl;

import java.util.Random;

import com.pattern.state.intf.State;

public class HasQuarterState implements State {

	private GumballMachine gumballMachine;
	private Random random = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int nextInt = random.nextInt(10);
		if(nextInt == 0 && gumballMachine.getCount() >= 2) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
