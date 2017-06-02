package com.pattern.command.intf;

public interface Command {

	//orderUp();
	public void execute();
	
	public void undo();
	
}
