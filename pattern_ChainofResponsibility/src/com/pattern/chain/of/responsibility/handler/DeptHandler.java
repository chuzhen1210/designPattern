package com.pattern.chain.of.responsibility.handler;

/**
 * 部门经理，审批额度不能大于1000
 * @author chuzhen
 *
 */
public class DeptHandler extends Handler {

	public DeptHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		System.out.println("我是部门经理...");
		if(free > 1000) {
			System.out.println("报销金额["+free+"]超过1000，需要进一步审批...");
			Handler nextHandler = getNextHandler();
			if(nextHandler != null) {
				nextHandler.doHandle(userName, free);
			}
		} else {
			System.out.println("给予报销:" + free);
		}
	}

}
