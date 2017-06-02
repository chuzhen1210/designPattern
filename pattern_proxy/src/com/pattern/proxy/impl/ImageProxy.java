package com.pattern.proxy.impl;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

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
public class ImageProxy implements Icon {

	private ImageIcon imageIcon;//��imageIcon������ϣ���ڼ��غ���ʾ����������ͼ��
	private URL imageUrl;		//ͼ�������URL
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
