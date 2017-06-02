package com.pattern.future.impl;

import com.pattern.future.intf.Data;

/**
 * FutureData��RealData�İ�װ
 * @author chuzhen
 *
 */
public class FutureData implements Data {

	protected RealData realData = null;
	protected boolean isReady = false;
	
	public synchronized void setRealData(RealData realData) {
		if(isReady) {
			return;
		}
		
		this.realData = realData;
		isReady = true;
		
		notifyAll();//realData�ѱ�ע�룬֪ͨgetResult();
	}
	
	@Override
	public synchronized String getResult() {
		while(!isReady) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return realData.getResult();
	}

}
