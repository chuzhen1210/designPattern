package com.pattern.chain.of.responsibility.handler;

/**
 * ���ž���������Ȳ��ܴ���1000
 * @author chuzhen
 *
 */
public class DeptHandler extends Handler {

	public DeptHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		System.out.println("���ǲ��ž���...");
		if(free > 1000) {
			System.out.println("�������["+free+"]����1000����Ҫ��һ������...");
			Handler nextHandler = getNextHandler();
			if(nextHandler != null) {
				nextHandler.doHandle(userName, free);
			}
		} else {
			System.out.println("���豨��:" + free);
		}
	}

}
