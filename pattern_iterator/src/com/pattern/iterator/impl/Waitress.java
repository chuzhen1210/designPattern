package com.pattern.iterator.impl;

import java.util.Iterator;

import com.pattern.iterator.intf.MenuComponent;

/**
 * ���ģʽ�ķ���Ա
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
	 * ��ӡ������ʳ�˵�
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
