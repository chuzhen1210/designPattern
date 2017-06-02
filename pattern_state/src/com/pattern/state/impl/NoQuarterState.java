package com.pattern.state.impl;

import com.pattern.state.intf.State;

public class NoQuarterState implements State {

	private GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	/**
	 * ×ªµ½HasQuarterState
	 */
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
