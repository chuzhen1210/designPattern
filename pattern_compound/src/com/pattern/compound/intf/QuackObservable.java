package com.pattern.compound.intf;

/**
 * <p>����һ���ӿڣ��κ��뱻�۲��Quackable������ʵ�ָýӿ�
 * <p>��Ҫע���֪ͨ�۲��ߵķ���
 * <p>ͨ��Ҳ��Ҫɾ���۲��ߵķ���������������Ϊ����ʵ�ֱ�ü򵥣���ʡ����
 * @author chuzhen
 *
 */
public interface QuackObservable {

	public void registerObserver(QuackObserver observer);
	public void notifyObservers();
}
