package com.pattern.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.pattern.proxy.intf.PersonBean;

public class OwnerInvocationHandler implements InvocationHandler {
	
	private PersonBean person;
	
	/**
	 * 将person传入构造器，并保持他的引用
	 * @param person
	 */
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if(method.getName().equals("setHotOrNotRating")) {//拥有者（用户自己）不允许调用此方法
				throw new IllegalAccessException();
			} else if(method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
			
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
