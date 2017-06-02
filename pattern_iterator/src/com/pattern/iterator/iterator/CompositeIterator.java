package com.pattern.iterator.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.pattern.iterator.bean.Menu;
import com.pattern.iterator.intf.MenuComponent;

/**
 * 工作是遍历组件内的菜单项，而且确保所有的子菜单（以及子子菜单……）都被包括进来。<br>
 * @author chuzhen
 *
 */
public class CompositeIterator implements Iterator<MenuComponent> {

	private Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		super();
		
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();//把没有下一个元素的当前迭代器移除
				return hasNext();//判断下一个迭代器是否还有元素
			} else {
				return true;
			}
		}
		
	}

	@Override
	public MenuComponent next() {
			Iterator<MenuComponent> currentIterator = stack.peek();
			MenuComponent next = currentIterator.next();
			
			if(next instanceof Menu) {
				stack.push(next.createIterator());
			}
			
			return next;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
