package com.pattern.chain.of.responsibility.handler;

public class GeneralHandler extends Handler {

	public GeneralHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		System.out.println("�����ܾ���...");
		System.out.println("���豨��:" + free);
	}

}
