package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.down();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
