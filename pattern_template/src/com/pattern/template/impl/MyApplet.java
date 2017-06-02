package com.pattern.template.impl;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Applet提供了好些钩子
 * @author chuzhen
 *
 */
public class MyApplet extends Applet {

	private static final long serialVersionUID = -6771513255514084167L;
	
	private String message;

	@Override
	public void init() {
		message = "Hello World, I'm alive!";
		repaint();
	}
	
	@Override
	public void start() {
		message = "Now I'm starting up...";
		repaint();
	}
	
	@Override
	public void stop() {
		message = "Oh, now I'm being stopped...";
		repaint();
	}
	
	@Override
	public void destroy() {
		message = "Oh, now I'm being destroyed...";
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(message, 4, 15);
	}
}
