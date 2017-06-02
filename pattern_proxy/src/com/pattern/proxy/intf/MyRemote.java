package com.pattern.proxy.intf;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 表示此接口用来支持远程调用
 * @author chuzhen
 *
 */
public interface MyRemote extends Remote {

	/**
	 * 声明所有的方法都会抛出 <code>RemoteException</code> 异常
	 * @return
	 * @throws RemoteException
	 */
	public String sayHello() throws RemoteException;
}
