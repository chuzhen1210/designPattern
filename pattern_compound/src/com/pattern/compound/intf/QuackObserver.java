package com.pattern.compound.intf;

/**
 * ���ɽй۲��ߣ�ֻ��Ҫһ��<code>update()</code>����
 * @author chuzhen
 *
 */
public interface QuackObserver {

	/**
	 * ��Ҫ���뱻�۲����
	 * @param duck
	 */
	public void update(QuackObservable duck);
}
