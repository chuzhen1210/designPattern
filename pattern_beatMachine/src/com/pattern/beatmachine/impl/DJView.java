package com.pattern.beatmachine.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.pattern.beatmachine.intf.BPMObserver;
import com.pattern.beatmachine.intf.BeatModelInterface;
import com.pattern.beatmachine.intf.BeatObserver;
import com.pattern.beatmachine.intf.ControllerInterface;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
	private BeatModelInterface model;
	private ControllerInterface controller;
	
	private JFrame viewFrame;
	private JPanel viewPanel;
//	private BeatBar beatBar;
	
	private JLabel bpmOutputLabel;
	private JFrame 

	@Override
	public void updateBPM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBeat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
