package com.pattern.command.receiver;

public class Light {

	private String name;
	
	public Light(String name) {
		super();
		this.name = name;
	}

	public void on() {
		System.out.println(name + " light is on");
	}
	
	public void off() {
		System.out.println(name + " light is off");
	}
}
