package com.pattern.proxy.impl;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;

import com.pattern.proxy.intf.ImageState;
import com.pattern.proxy.state.ImageNotLoaded;

/**
 * <pre>
 * -ҵ�񷽰�
 * 	+�������1
 * 	-�������2
 * 		����1
 * 		����2
 * </pre>
 * <ul>
 * <li>ImageProxy���ȴ���һ��ImageIcon��Ȼ��ʼ������URL�ϼ���ͼ��
 * 
 * <li>�ڼ��صĹ����У�ImageProxy��ʾ��ͼ������У����Ժ󡭡�����
 * 
 * <li>��ͼ�������ϣ�ImageProxy�����з�������ί�и�������ImageIcon��
 * 		��Щ��������paintIcon()��getWidth()��getHeight()��
 * 
 * <li>����û������µ�ͼ�����Ǿʹ����µĴ����ظ������Ĺ���
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
