package com.pattern.command.client;
import com.pattern.command.impl.GarageDoorUpCommand;
import com.pattern.command.impl.LightOnCommand;
import com.pattern.command.intf.Command;
import com.pattern.command.invoker.SimpleRemoteControl;
import com.pattern.command.receiver.GarageDoor;
import com.pattern.command.receiver.Light;

/**
 * ����ģʽ�Ŀͻ�
 * @author chuzhen
 *
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		//ң�������ǵ����ߣ��ᴫ��һ��������󣬿���������������
		SimpleRemoteControl control = new SimpleRemoteControl();
		
		Command command = getLightCommand();
		//�������������
		control.setCommand(command);
		control.buttonWasPressed();
		
		command = getGarageDoorCommand();
		control.setCommand(command);
		control.buttonWasPressed();
	}

	private static Command getLightCommand() {
		//���ڴ���һ����ƶ��󣬴˶���Ҳ��������Ľ�����
		Light light = new Light("Living Room");
		//�����ﴴ��һ�����Ȼ�󽫽����ߴ�������
		LightOnCommand lightOn = new LightOnCommand(light);
		return lightOn;
	}
	
	private static Command getGarageDoorCommand() {
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorUpCommand command = new GarageDoorUpCommand(garageDoor);
		return command;
	}
}
