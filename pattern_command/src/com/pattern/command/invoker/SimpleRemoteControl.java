package com.pattern.command.invoker;

import com.pattern.command.intf.Command;

/**
 * 遥控器
 * @author chuzhen
 *
 */
public class SimpleRemoteControl {

	private Command slot;//插槽,该插槽持有命令，而这个命令控制着一个装置

	public SimpleRemoteControl() {
		super();
	}
	
	/**
	 * 这个方法用来设置插槽控制的命令。如果这段代码的客户想要改变遥控器按钮的行为，可以多次调用这个方法。
	 * @param command
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	/**
	 * 当按下按钮时，这个方法就会被调用，使得当前命令衔接插槽，并调用它的execute()方法
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
