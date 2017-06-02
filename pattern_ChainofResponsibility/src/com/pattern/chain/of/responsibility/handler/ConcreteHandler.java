package com.pattern.chain.of.responsibility.handler;

public class ConcreteHandler extends Handler {

	public ConcreteHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		if(getNextHandler() != null) {
			System.out.println("����������...");
			getNextHandler().doHandle(userName, free);
		} else {
			System.out.println("�����������նˣ����Լ�����...");
		}
	}

}
