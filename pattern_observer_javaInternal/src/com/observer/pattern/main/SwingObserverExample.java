package com.observer.pattern.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	private JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("Should I du ite?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(button);
		frame.setVisible(true);
		frame.setSize(800, 600);
	}
	
	class AngelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Dont't do it, you might reget it!");
		}
	}
	
	class DevilListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it");
		}
		
	}
}
