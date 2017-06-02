package com.pattern.chain.of.responsibility.handler;

/**
 * 项目经理，审批额度不能大于500
 * @author chuzhen
 *
 */
public class ProjectHandler extends Handler {

	public ProjectHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void doHandle(String userName, double free) {
		System.out.println("我是项目经理...");
		if(free > 500) {
			System.out.println("报销金额["+free+"]超过500，需要进一步审批...");
			Handler nextHandler = getNextHandler();
			if(nextHandler != null) {
				nextHandler.doHandle(userName, free);
			}
		} else {
			if("chuzhen".equals(userName)) {
				System.out.println("给予报销:" + free);
			} else {
				System.out.println("报销不通过，请联系楚阵代为申请...");
			}
		}
	}

}
