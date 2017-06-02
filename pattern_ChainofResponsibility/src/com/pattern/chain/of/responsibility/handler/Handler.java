package com.pattern.chain.of.responsibility.handler;

/**
 * <p>�������̴�����
 * <p>������Ŀ����������Ȳ��ܴ���500,���ž����������Ȳ��ܴ���1000,����1000����Ҫ�ܾ�������
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
	 * �������߼�
	 * @param userName ������
	 * @param free �������
	 */
	public abstract void doHandle(String userName, double free);
	
}
