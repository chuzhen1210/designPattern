package com.pattern.guarded.suspension.data;

public class RealData implements Data {

	private String data;
	
	public RealData(String data) {
		super();
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(data);
			
			try {
				Thread.sleep(100);//代替一个很慢的构造过程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = sb.toString();
	}

	@Override
	public String getResult() {
		return this.data;
	}

}
