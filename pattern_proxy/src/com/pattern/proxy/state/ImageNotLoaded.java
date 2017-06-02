package com.pattern.proxy.state;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import com.pattern.proxy.impl.ImageProxyWithState;
import com.pattern.proxy.intf.ImageState;

public class ImageNotLoaded implements ImageState {

	private ImageProxyWithState imageProxy;
	
	private Thread retrievalThread;
	private boolean retrieing = false;
	
	public ImageNotLoaded(ImageProxyWithState imageProxy) {
		super();
		
		this.imageProxy = imageProxy;
	}

	@Override
	public int getIconWidth() {
		return 800;
	}

	@Override
	public int getIconHeight() {
		return 600;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		g.drawString("Loading CD cover, please wait...", x+300, y+190);
		
		if(!retrieing) {
			retrieing = true;
			
			retrievalThread = new Thread(new Runnable() {
				@Override
				public void run() {
					ImageIcon imageIcon = new ImageIcon(imageProxy.getImageUrl(), "CD Cover");
					
					ImageLoaded imageLoaded = new ImageLoaded(imageIcon);
					imageProxy.setImageLoaded(imageLoaded);
					
					imageProxy.setImageState(imageProxy.getImageLoaded());
					
					c.repaint();
				}
			});
			
			retrievalThread.start();
		}
	}

}
