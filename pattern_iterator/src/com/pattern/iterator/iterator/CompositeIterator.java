package com.pattern.iterator.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.pattern.iterator.bean.Menu;
import com.pattern.iterator.intf.MenuComponent;

/**
 * �����Ǳ�������ڵĲ˵������ȷ�����е��Ӳ˵����Լ����Ӳ˵���������������������<br>
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
				stack.pop();//��û����һ��Ԫ�صĵ�ǰ�������Ƴ�
				return hasNext();//�ж���һ���������Ƿ���Ԫ��
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
