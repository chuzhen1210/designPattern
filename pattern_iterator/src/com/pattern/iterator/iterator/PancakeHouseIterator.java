package com.pattern.iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;

public class PancakeHouseIterator implements Iterator<MenuItem> {

	private ArrayList<MenuItem> menuItems;
	private int position;
	
	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return position < menuItems.size();
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems.get(position);
		position ++;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
