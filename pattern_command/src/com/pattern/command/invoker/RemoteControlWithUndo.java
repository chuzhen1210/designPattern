package com.pattern.command.invoker;

import com.pattern.command.impl.NoCommand;
import com.pattern.command.intf.Command;

public class RemoteControlWithUndo {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;//前一个命令将被记录在这里，用于撤销
	
	public RemoteControlWithUndo() {
		super();
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	/**
	 * 打印出每个插槽和它对应的命令
	 */
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------Remote Control------\n");
		
		for(int i=0; i<onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "]").append(onCommands[i].getClass().getName())
						.append("\t").append(offCommands[i].getClass().getName()).append("\n");
		}
		
		return stringBuffer.toString();
	}
}
