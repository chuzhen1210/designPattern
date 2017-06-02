package com.pattern.iterator.iterator;

import java.util.Calendar;
import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;

/**
 * 交替变换的菜单，周一、三、五提供一些，周二、四、六、日提供一些
 * @author chuzhen
 *
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] menuItems;
	private int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
		
		Calendar rightNow = Calendar.getInstance();
		int dayOfWeek = rightNow.get(Calendar.DAY_OF_WEEK);
		this.position = dayOfWeek % 2; 
	}

	@Override
	public boolean hasNext() {
		return position < menuItems.length;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = this.menuItems[position];
		position += 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Alternating Diner Menu Iterator dose not support remove() method");
	}

}
