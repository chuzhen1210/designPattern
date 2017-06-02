package com.pattern.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;
import com.pattern.iterator.intf.Menu;
import com.pattern.iterator.iterator.PancakeHouseIterator;

/**
 * ¼å±ýÎÝµÄ²Ëµ¥
 * @author chuzhen
 *
 */
public class PancakeHouseMenu implements Menu {

	private ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		super();
		this.menuItems = new ArrayList<MenuItem>();
		
		addItem(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		addItem(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
		addItem(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", false, 3.49));
		addItem(new MenuItem("Waffles", "Wafffles, with your choice of blueberries or strawberries", true, 3.59));
	}
	
	public void addItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}

//	public ArrayList<MenuItem> getMenuItems() {
//		return menuItems;
//	}
	
	public Iterator<MenuItem> createIterator() {
		return new PancakeHouseIterator(this.menuItems);
	}
	
}
