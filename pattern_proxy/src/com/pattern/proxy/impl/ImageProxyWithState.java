package com.pattern.proxy.impl;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;

import com.pattern.proxy.intf.ImageState;
import com.pattern.proxy.state.ImageNotLoaded;

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
public class ImageProxyWithState implements Icon {

	private URL imageUrl;
	
	private ImageState imageLoaded;
	private ImageState imageNotLoaded;
	private ImageState imageState;
	
	public ImageProxyWithState(URL imageUrl) {
		super();

		this.imageUrl = imageUrl;
		
		this.imageNotLoaded = new ImageNotLoaded(this);
		this.imageState = this.imageNotLoaded;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		this.imageState.paintIcon(c, g, x, y);
	}

	@Override
	public int getIconWidth() {
		return this.imageState.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		return this.imageState.getIconHeight();
	}

	public ImageState getImageLoaded() {
		return imageLoaded;
	}

	public void setImageLoaded(ImageState imageLoaded) {
		this.imageLoaded = imageLoaded;
	}

	public URL getImageUrl() {
		return imageUrl;
	}

	public ImageState getImageState() {
		return imageState;
	}

	public void setImageState(ImageState imageState) {
		this.imageState = imageState;
	}
	
}
