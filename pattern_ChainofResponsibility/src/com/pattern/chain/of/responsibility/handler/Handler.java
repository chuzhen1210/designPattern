package com.pattern.chain.of.responsibility.handler;

/**
 * <p>报销流程处理器
 * <p>其中项目经理审批额度不能大于500,则部门经理的审批额度不能大于1000,超过1000则需要总经理审批
 * @author chuzhen
 *
 */
public abstract class Handler {

	private Handler nextHandler;

	public Handler(Handler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * 处理报销逻辑
	 * @param userName 申请人
	 * @param free 报销金额
	 */
	public abstract void doHandle(String userName, double free);
	
}
