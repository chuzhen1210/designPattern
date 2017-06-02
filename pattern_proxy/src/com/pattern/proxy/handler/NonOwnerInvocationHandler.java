package com.pattern.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.pattern.proxy.intf.PersonBean;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean person;
	
	public NonOwnerInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if(method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if(method.getName().startsWith("set")) {//��ӵ���ߣ������ˣ��������޸��û�������Ϣ
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
