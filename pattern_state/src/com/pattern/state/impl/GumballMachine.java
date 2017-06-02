package com.pattern.state.impl;

import com.pattern.state.intf.State;

/**
 * ÌÇ¹û»ú
 * @author chuzhen
 *
 */
public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State WinnerState;
	
	private State  state = soldOutState;
	private int count = 0;
	
	public GumballMachine(int count) {
		super();
		
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.WinnerState = new WinnerState(this);
		
		this.count = count;
		if(count > 0) {
			this.state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		this.state.insertQuarter();
	}
	
	public void ejectQuarter() {
		this.state.ejectQuarter();
	}
	
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot");
		if(count > 0) {
			count --;
		}
	}
	
	public void refill(int count) {
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return WinnerState;
	}

	public int getCount() {
		return count;
	}
	
	
}
