package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.CeilingFan;

/**
 * 高速
 * @author chuzhen
 *
 */
public class CeilingFanHighCommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();//执行当前命令前的吊扇状态
		ceilingFan.high();
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
