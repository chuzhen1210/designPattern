package com.pattern.guarded.suspension.queue;

import java.util.LinkedList;
import java.util.Queue;

import com.pattern.guarded.suspension.request.Request;

public class RequestQueue {

	private Queue<Request> queue = new LinkedList<Request>();
	
	public synchronized Request getRequest() {
		while(queue.size() == 0) {
			try {
				wait();//�ȴ�ֱ�����µ��������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return queue.poll();//���ض����е�һ������
	}
	
	public synchronized void addRequest(Request request) {
		queue.add(request);//�����µ�����
		notifyAll();//����getReuqest()����
	}
}
