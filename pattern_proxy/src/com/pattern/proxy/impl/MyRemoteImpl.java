package com.pattern.proxy.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.pattern.proxy.intf.MyRemote;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	private static final long serialVersionUID = 4992645135830074898L;

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}

}
