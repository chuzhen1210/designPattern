package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

	private CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
