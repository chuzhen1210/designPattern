package com.pattern.iterator.menu;

import java.util.Hashtable;
import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;
import com.pattern.iterator.intf.Menu;

/**
 * ¿§·ÈÌü²Ëµ¥
 * @author chuzhen
 *
 */
public class CafeMenu implements Menu {

	Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

	public CafeMenu() {
		super();
		
		addItem(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
		addItem(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
		addItem(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
	}
	
	public void addItem(MenuItem item) {
		this.menuItems.put(item.getName(), item);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return this.menuItems.values().iterator();
	}
}
