package com.pattern.proxy.intf;

import java.awt.Component;
import java.awt.Graphics;

public interface ImageState {

	int getIconWidth();
	
	int getIconHeight();
	
	void paintIcon(Component c, Graphics g, int x, int y);
}
