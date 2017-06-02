package com.pattern.proxy.state;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import com.pattern.proxy.intf.ImageState;

public class ImageLoaded implements ImageState {

	private ImageIcon imageIcon;//此imageIcon是我们希望在加载后显示出来的真正图像
	
	public ImageLoaded(ImageIcon imageIcon) {
		super();
		this.imageIcon = imageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	@Override
	public int getIconWidth() {
		return imageIcon.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		return imageIcon.getIconHeight();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		imageIcon.paintIcon(c, g, x, y);
	}


}
