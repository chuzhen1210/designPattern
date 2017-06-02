package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.Stereo;

public class StereoOffCommand implements Command {

	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
