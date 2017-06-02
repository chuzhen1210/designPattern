package com.pattern.iterator.intf;

import java.util.Iterator;

/**
 * 所有的组件都必须实现该接口，叶节点和组合节点的角色不同，所以有些方法可能并不适合某种节点。<br>
 * 面对这种情况，有时候，你最好抛出运行时异常
 * @author chuzhen
 *
 */
public abstract class MenuComponent {

	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator<MenuComponent> createIterator();
}
