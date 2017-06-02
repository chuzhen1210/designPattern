package com.pattern.proxy.client;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.pattern.proxy.impl.ImageProxy;

public class ImageProxyTestDrive {

	public static void main(String[] args) throws Exception {
		testImageProxy();
	}
	
	public static void testImageProxy() throws Exception {
		URL imageUrl = new URL("http://i3.hoopchina.com.cn/blogfile/201612/12/BbsImg148151937432974_639x399.jpg@60Q.jpg");
		Icon icon = new ImageProxy(imageUrl);
		
		JButton button = new JButton(icon);
		
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		jFrame.setSize(800, 600);
		jFrame.getContentPane().add(button);
	}

}
