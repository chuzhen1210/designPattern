package com.pattern.guarded.suspension.request;

import com.pattern.guarded.suspension.data.Data;

/**
 * 请求对象
 * @author chuzhen
 *
 */
public class Request {

	private String name;//请求内容
	private Data response;//FutureData

	public Request(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public synchronized void setResponse(Data response) {
		this.response = response;
	}
	
	public Data getResponse() {
		return response;
	}
	
	@Override
	public String toString() {
		return "[Request:" + name + "]";
	}
}
