package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.Hottub;

public class HottubOnCommand implements Command {

	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		super();
		this.hottub = hottub;
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
