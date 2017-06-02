package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.off();
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if(prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if(prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if(prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
