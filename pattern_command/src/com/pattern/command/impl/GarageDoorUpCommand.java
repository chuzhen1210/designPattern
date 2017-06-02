package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
