package com.pattern.command.receiver;

/**
 * ≥µø‚¥Û√≈
 * @author chuzhen
 *
 */
public class GarageDoor {
	
	private String name;

	public GarageDoor(String name) {
		super();
		this.name = name;
	}

	public void up() {
		System.out.println("garageDoor is up");
	}
	
	public void down() {
		System.out.println("garageDoor is down");
	}
	
	public void stop() {
		System.out.println("garageDoor is stop");
	}
	
	public void ligntOn() {
		System.out.println("garageDoor is ligntOn");
	}
	
	public void lightOff() {
		System.out.println("garageDoor is lightOff");
	}
	
	
}
