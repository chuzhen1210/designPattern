package com.pattern.command.receiver;

public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private String location;
	private int speed;//代表吊扇的速度

	public CeilingFan(String name) {
		super();
		this.location = name;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
	}
	
	public void medium() {
		speed = MEDIUM;
	}
	
	public void low() {
		speed = LOW;
	}
	
	public void on() {
		System.out.println(location + " fan is on high");
	}
	
	public void off() {
		speed = OFF;
		System.out.println(location + " fan is off");
	}
	
	public int getSpeed() {
		return speed;
	}
}
