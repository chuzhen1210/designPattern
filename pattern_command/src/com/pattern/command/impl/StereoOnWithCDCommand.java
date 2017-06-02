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

		stereo.on();//首先打开它
		stereo.setCD();//然后设置成播放CD
		stereo.SetVolume(11);//设置音量
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
