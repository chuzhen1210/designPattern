package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {

		stereo.on();//���ȴ���
		stereo.setCD();//Ȼ�����óɲ���CD
		stereo.SetVolume(11);//��������
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
