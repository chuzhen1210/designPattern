package com.pattern.adapter.adapter;

import com.pattern.adapter.intf.Duck;
import com.pattern.adapter.intf.Turkey;

/**
 * 首先，实现想转换成的类型接口，也就是客户期望看到的接口
 * @author chuzhen
 *
 */
public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	/**
	 * 需要取得要适配的对象引用
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
