package com.pattern.iterator.iterator;

import java.util.Iterator;

import com.pattern.iterator.intf.MenuComponent;

/**
 * �յ�������������Ҷ�ڵ�
 * @author chuzhen
 *
 */
public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
