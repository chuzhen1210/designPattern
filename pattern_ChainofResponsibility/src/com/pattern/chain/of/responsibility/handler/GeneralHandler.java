package com.pattern.chain.of.responsibility.handler;

public class GeneralHandler extends Handler {

	public GeneralHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		System.out.println("我是总经理...");
		System.out.println("给予报销:" + free);
	}

}
