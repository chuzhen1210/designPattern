package com.pattern.iterator.menu;

import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;
import com.pattern.iterator.intf.Menu;
import com.pattern.iterator.iterator.DinerMenuIterator;

/**
 * 餐厅菜单
 * @author chuzhen
 *
 */
public class DinerMenu implements Menu{

	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	public DinerMenu() {
		super();
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
		addItem(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		addItem(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
		addItem(new MenuItem("Hotdot", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
	}
	
	public void addItem(MenuItem menuItem) {
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems ++;
		}
	}

	/**
	 * 我们不需要，会暴露我们内部的实现
	 * @return
	 */
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(this.menuItems);
	}
}
