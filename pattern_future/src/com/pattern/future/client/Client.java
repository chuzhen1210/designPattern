package com.pattern.future.client;

import com.pattern.future.impl.FutureData;
import com.pattern.future.impl.RealData;
import com.pattern.future.intf.Data;

public class Client {

	public Data request(final String queryStr) {
		final FutureData future = new FutureData();
		
		new Thread() {
			@Override
			public void run() {
				RealData realData = new RealData(queryStr);
				future.setRealData(realData);
			}
		}.start();;
		
		return future;
	}
}
