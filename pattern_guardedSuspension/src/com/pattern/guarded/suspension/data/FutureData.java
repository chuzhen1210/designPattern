package com.pattern.guarded.suspension.data;

public class FutureData implements Data {

	private boolean ready = false;
	private RealData realData;
	
	public FutureData() {
		super();
	}

	public synchronized void setRealData(RealData realData) {
		if(ready) {
			return;
		}
		
		this.realData = realData;
		this.ready = true;
		
		notifyAll();//RealData已经被注入，通知getResponse();
	}
	
	@Override
	public synchronized String getResult() {
		while(!ready) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return this.realData.getResult();
	}

}
