package com.observer.pattern.intf;

/**
 * �۲��߽ӿڣ������������<br>
 * ���еĹ۲��߶�����ʵ��update()��������ʵ�ֹ۲��߽ӿڡ�
 * 
 * @author chuzhen
 *
 */
public interface Observer {

	/**
	 * ������۲�ֵ�ı�ʱ����������Щ��Щ״ֵ̬���������Ĳ��������ݸ��۲���
	 * @param temperature
	 * @param humidity
	 * @param presure
	 */
	public void update(float temperature, float humidity, float presure);
	
}
