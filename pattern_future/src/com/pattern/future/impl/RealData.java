package com.pattern.future.impl;

import com.pattern.future.intf.Data;

public class RealData implements Data {
	
	protected final String result;

	public RealData(String para) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 10; i++) {
			sb.append(para).append(i);
			try {
				Thread.sleep(100);//ʹ��sleep������һ�������Ĳ�������
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		result = sb.toString();
	}

	@Override
	public String getResult() {
		return result;
	}

}
