package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.Light;

public class LightOnCommand implements Command {
	
	private Light light;
	
	/**
	 * ��������������ĳ����ƣ��ȷ�˵�������ĵ�ƣ����Ա��õ�ǰ���������ƣ�Ȼ���¼��ʵ�������С�
	 * һ������execute()�����������ƶ����Ϊ�����ߣ������������
	 * @param light
	 */
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	/**
	 * ���ý��ն����������ڿ��Ƶĵ�ƣ���on()����
	 */
	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		light.off();
	}

}
