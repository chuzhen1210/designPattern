package com.decorator.pattern.intf;

public abstract class Beverage {
	
	public enum Size {
		TALL, GRANDE, VENTI;
	}
	
	protected String description = "unknown beverage";
	protected Size size;
	
	/**
	 * Ä¬ÈÏÖÐ±­
	 */
	public Beverage() {
		this(Size.GRANDE);
	}
	
	public Beverage(Size size) {
		this.size = size;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();
}
