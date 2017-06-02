package com.pattern.guarded.suspension.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pattern.guarded.suspension.data.FutureData;
import com.pattern.guarded.suspension.queue.RequestQueue;
import com.pattern.guarded.suspension.request.Request;

public class ClientThread extends Thread {

	private RequestQueue requestQueue;
	private List<Request> myRequestList = new ArrayList<Request>();
	
	public ClientThread(RequestQueue requestQueue, String name) {
		super(name);
		this.requestQueue = requestQueue;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		for(int i = 0; i < 10; i++) {
			Request request = new Request("RequestID:" + i + ",Thread_Name:" + threadName);
			
			System.out.println(threadName + " requests " + request);
			
			request.setResponse(new FutureData());
			requestQueue.addRequest(request);//提交请求
			myRequestList.add(request);
			
			try {
				//客户端请求的速度快于服务端处理的速度
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ClientRequest name is " + threadName);
		
		System.out.println(threadName + " request end");
		
		for (Request request : myRequestList) {
			String result = request.getResponse().getResult();
			System.out.println("response is:" + result);
		}
	}
}
