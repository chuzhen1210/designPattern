package com.pattern.proxy.intf;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * ��ʾ�˽ӿ�����֧��Զ�̵���
 * @author chuzhen
 *
 */
public interface MyRemote extends Remote {

	/**
	 * �������еķ��������׳� <code>RemoteException</code> �쳣
	 * @return
	 * @throws RemoteException
	 */
	public String sayHello() throws RemoteException;
}
