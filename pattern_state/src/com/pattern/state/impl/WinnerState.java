package com.pattern.state.impl;

import com.pattern.state.intf.State;

public class WinnerState implements State {
	
	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER, You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() > 0) {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
