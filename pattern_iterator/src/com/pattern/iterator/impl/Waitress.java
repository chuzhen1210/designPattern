package com.pattern.iterator.impl;

import java.util.Iterator;

import com.pattern.iterator.intf.MenuComponent;

/**
 * 组合模式的服务员
 * @author chuzhen
 *
 */
public class Waitress {

	private MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	/**
	 * 打印所有素食菜单
	 */
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n----");
		Iterator<MenuComponent> rootIterator = allMenus.createIterator();
		while(rootIterator.hasNext()) {
			MenuComponent next = rootIterator.next();
			
			try {
				if(next.isVegetarian()) {
					next.print();
				}
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			}
		}
	}
}
