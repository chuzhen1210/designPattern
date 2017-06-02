package com.pattern.command.receiver;

public class TV {

	private String location;
	
	public TV(String location) {
		super();
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " TV is on");
	}
	
	public void off() {
		
	}
	
	public void setInputChannel() {
		
	}
	
	public void setVolumn() {
		
	}
}
