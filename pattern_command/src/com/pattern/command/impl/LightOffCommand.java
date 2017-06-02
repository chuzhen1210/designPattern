package com.pattern.command.impl;

import com.pattern.command.intf.Command;
import com.pattern.command.receiver.Light;

public class LightOffCommand implements Command {
	
	private Light light;
	
	/**
	 * ��������������ĳ����ƣ��ȷ�˵�������ĵ�ƣ����Ա��õ�ǰ���������ƣ�Ȼ���¼��ʵ�������С�
	 * һ������execute()�����������ƶ����Ϊ�����ߣ������������
	 * @param light
	 */
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	/**
	 * ���ý��ն����������ڿ��Ƶĵ�ƣ���off����
	 */
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
