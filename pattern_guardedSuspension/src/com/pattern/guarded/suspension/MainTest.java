package com.pattern.guarded.suspension;

import com.pattern.guarded.suspension.queue.RequestQueue;
import com.pattern.guarded.suspension.thread.ClientThread;
import com.pattern.guarded.suspension.thread.ServerThread;

public class MainTest {

	public static void main(String[] args) {
		RequestQueue requestQueue = new RequestQueue();
		
		for(int i = 0; i < 10; i++) {
			new ServerThread(requestQueue, "ServerThread" + i).start();
		}
		
		for (int i = 0; i < 10; i++) {
			new ClientThread(requestQueue, "ClientThread" + i).start();;
		}
	}
}
