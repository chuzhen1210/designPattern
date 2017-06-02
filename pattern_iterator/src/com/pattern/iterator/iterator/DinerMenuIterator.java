package com.pattern.iterator.iterator;

import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;

/**
 * ²ÍÌü²Ëµ¥Ïîµü´úÆ÷
 * @author chuzhen
 *
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] menuItems;
	private int position;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return position < menuItems.length;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position ++;
		return menuItem;
	}

	@Override
	public void remove() {
		
	}

}
