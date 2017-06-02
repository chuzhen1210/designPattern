package com.pattern.command.invoker;

import com.pattern.command.intf.Command;

/**
 * ң����
 * @author chuzhen
 *
 */
public class SimpleRemoteControl {

	private Command slot;//���,�ò�۳��������������������һ��װ��

	public SimpleRemoteControl() {
		super();
	}
	
	/**
	 * ��������������ò�ۿ��Ƶ���������δ���Ŀͻ���Ҫ�ı�ң������ť����Ϊ�����Զ�ε������������
	 * @param command
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	/**
	 * �����°�ťʱ����������ͻᱻ���ã�ʹ�õ�ǰ�����νӲ�ۣ�����������execute()����
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
