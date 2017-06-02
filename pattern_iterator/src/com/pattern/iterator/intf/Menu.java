package com.pattern.iterator.intf;

import java.util.Iterator;

import com.pattern.iterator.bean.MenuItem;

public interface Menu {

	public Iterator<MenuItem> createIterator();
}
