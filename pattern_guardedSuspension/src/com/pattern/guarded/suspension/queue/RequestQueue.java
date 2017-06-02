package com.pattern.guarded.suspension.queue;

import java.util.LinkedList;
import java.util.Queue;

import com.pattern.guarded.suspension.request.Request;

public class RequestQueue {

	private Queue<Request> queue = new LinkedList<Request>();
	
	public synchronized Request getRequest() {
		while(queue.size() == 0) {
			try {
				wait();//等待直到有新的请求加入
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return queue.poll();//返回队列中第一个请求
	}
	
	public synchronized void addRequest(Request request) {
		queue.add(request);//加入新的请求
		notifyAll();//唤醒getReuqest()方法
	}
}
