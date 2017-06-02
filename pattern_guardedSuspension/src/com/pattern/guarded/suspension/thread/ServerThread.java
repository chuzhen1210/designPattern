package com.pattern.guarded.suspension.thread;

import com.pattern.guarded.suspension.data.Data;
import com.pattern.guarded.suspension.data.FutureData;
import com.pattern.guarded.suspension.data.RealData;
import com.pattern.guarded.suspension.queue.RequestQueue;
import com.pattern.guarded.suspension.request.Request;

public class ServerThread extends Thread {

	private RequestQueue requestQueue;
	
	public ServerThread(RequestQueue requestQueue, String name) {
		super(name);
		this.requestQueue = requestQueue;
	}

	@Override
	public void run() {
		while(true) {
			Request request = requestQueue.getRequest();//获取请求
			
			Data response = request.getResponse();
			if(response instanceof FutureData) {
				FutureData futureData = (FutureData) response;
				
				//RealData的创建比较耗时
				RealData realData = new RealData(request.getName());
				futureData.setRealData(realData);
			}
			
			System.out.println(Thread.currentThread().getName() + " handles " + request);
		}
	}
	
}
