package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.TV;

public class TVOnCommand implements Command {

	private TV tv;
	
	public TVOnCommand(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
