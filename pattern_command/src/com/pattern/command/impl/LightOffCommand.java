package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.Light;

public class LightOffCommand implements Command {
	
	private Light light;
	
	/**
	 * 构造器被传入了某个点灯（比方说：客厅的电灯），以便让当前这个命令控制，然后记录在实例变量中。
	 * 一旦调用execute()，就有这个电灯对象成为接受者，负责接受请求
	 * @param light
	 */
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	/**
	 * 调用接收对象（我们正在控制的电灯）的off方法
	 */
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
