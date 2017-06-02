package com.pattern.adapter.adapter;

import com.pattern.adapter.intf.Duck;
import com.pattern.adapter.intf.Turkey;

/**
 * ���ȣ�ʵ����ת���ɵ����ͽӿڣ�Ҳ���ǿͻ����������Ľӿ�
 * @author chuzhen
 *
 */
public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	/**
	 * ��Ҫȡ��Ҫ����Ķ�������
	 * @param turkey
	 */
	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}

}
