package com.pattern.command.receiver;

/**
 * “ÙœÏ
 * @author chuzhen
 *
 */
public class Stereo {

	private String name;
	
	public Stereo(String name) {
		super();
		this.name = name;
	}

	public void on() {
		System.out.println(name + " stereo is on");
	}
	
	public void off() {
		System.out.println(name + " stereo is off");
	}
	
	public void setCD() {
		System.out.println(name + " stereo is set CD for input");
	}
	
	public void SetVolume(int volume) {
		System.out.println(name + " stereo volume set to " + volume);
	}
}
