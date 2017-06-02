package com.pattern.proxy.impl;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * <pre>
 * -业务方案
 * 	+报表分组1
 * 	-报表分组2
 * 		报表1
 * 		报表2
 * </pre>
 * <ul>
 * <li>ImageProxy首先创建一个ImageIcon，然后开始从网络URL上加载图像。
 * 
 * <li>在加载的过程中，ImageProxy显示“图像加载中，请稍后……”。
 * 
 * <li>当图像加载完毕，ImageProxy把所有方法调用委托给真正的ImageIcon，
 * 		这些方法包括paintIcon()、getWidth()和getHeight()。
 * 
 * <li>如果用户请求新的图像，我们就创建新的代理，重复这样的过程
 * </ul>
 * @author chuzhen
 *
 */
public class ImageProxy implements Icon {

	private ImageIcon imageIcon;//此imageIcon是我们希望在加载后显示出来的真正图像
	private URL imageUrl;		//图像的网络URL
	private Thread retrievalThread;//
	private boolean retrieing = false;
	
	public ImageProxy(URL imageUrl) {
		super();
		this.imageUrl = imageUrl;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if(imageIcon == null) {
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			
			if(!retrieing) {
				retrieing = true;
				
				retrievalThread = new Thread(new Runnable() {
					@Override
					public void run() {
						imageIcon = new ImageIcon(imageUrl, "CD Cover");
						c.repaint();
					}
				});
				
				retrievalThread.start();
			}
		} else {
			imageIcon.paintIcon(c, g, x, y);
		}
	}

	@Override
	public int getIconWidth() {
		if(imageIcon == null) {
			return 800;
		} else {
			return imageIcon.getIconWidth();
		}
	}

	@Override
	public int getIconHeight() {
		if(imageIcon == null) {
			return 600;
		} else {
			return imageIcon.getIconHeight();
		}
	}

}
