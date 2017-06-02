package com.pattern.chain.of.responsibility.handler;

/**
 * ��Ŀ����������Ȳ��ܴ���500
 * @author chuzhen
 *
 */
public class ProjectHandler extends Handler {

	public ProjectHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		System.out.println("������Ŀ����...");
		if(free > 500) {
			System.out.println("�������["+free+"]����500����Ҫ��һ������...");
			Handler nextHandler = getNextHandler();
			if(nextHandler != null) {
				nextHandler.doHandle(userName, free);
			}
		} else {
			if("chuzhen".equals(userName)) {
				System.out.println("���豨��:" + free);
			} else {
				System.out.println("������ͨ��������ϵ�����Ϊ����...");
			}
		}
	}

}
