package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();//ִ�е�ǰ����ǰ�ĵ���״̬
		ceilingFan.medium();;
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
