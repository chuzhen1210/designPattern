package com.observer.pattern.intf;

/**
 * ����ӿڣ�����ӵ����
 * @author chuzhen
 *
 */
public interface Subject {

	/**
	 * ע��۲���
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * �Ƴ��۲���
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * ֪ͨ�۲��߸�������
	 */
	public void notifyObservers();
	
}
