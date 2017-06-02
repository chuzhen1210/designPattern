package com.pattern.proxy.handler.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.pattern.proxy.handler.NonOwnerInvocationHandler;
import com.pattern.proxy.handler.OwnerInvocationHandler;
import com.pattern.proxy.intf.PersonBean;

public class ProxyFactory {

	public static PersonBean getOwnerProxy(PersonBean person) {
		ClassLoader classLoader = person.getClass().getClassLoader();
		Class<?>[] interfaces = person.getClass().getInterfaces();
		OwnerInvocationHandler ownerInvocationHandler = new OwnerInvocationHandler(person);
		
		Object proxyInstance = Proxy.newProxyInstance(classLoader, interfaces, ownerInvocationHandler);
		
		return (PersonBean) proxyInstance;
	}
	
	public static PersonBean getNonOwnerProxy(PersonBean person) {
		ClassLoader classLoader = person.getClass().getClassLoader();
		Class<?>[] interfaces = person.getClass().getInterfaces();
		NonOwnerInvocationHandler nonOwnerInvocationHandler = new NonOwnerInvocationHandler(person);
		
		Object proxyInstance = Proxy.newProxyInstance(classLoader, interfaces, nonOwnerInvocationHandler);
		
		return (PersonBean) proxyInstance;
	}
	
	public static PersonBean getProxy(PersonBean person, InvocationHandler invocationHandler) {
		ClassLoader classLoader = person.getClass().getClassLoader();
		Class<?>[] interfaces = person.getClass().getInterfaces();
		
		Object proxyInstance = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		
		return (PersonBean) proxyInstance;
	}
}
