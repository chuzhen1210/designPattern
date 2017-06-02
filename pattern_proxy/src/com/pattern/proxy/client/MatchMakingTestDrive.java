package com.pattern.proxy.client;

import com.pattern.proxy.handler.factory.ProxyFactory;
import com.pattern.proxy.impl.PersonBeanImpl;
import com.pattern.proxy.intf.PersonBean;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		PersonBean joe = new PersonBeanImpl();
		
		PersonBean ownerProxy = ProxyFactory.getOwnerProxy(joe);
	}

}
