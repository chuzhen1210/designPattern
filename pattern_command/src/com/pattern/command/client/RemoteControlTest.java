package com.pattern.command.client;
import com.pattern.command.impl.GarageDoorUpCommand;
import com.pattern.command.impl.LightOnCommand;
import com.pattern.command.intf.Command;
import com.pattern.command.invoker.SimpleRemoteControl;
import com.pattern.command.receiver.GarageDoor;
import com.pattern.command.receiver.Light;

/**
 * 命令模式的客户
 * @author chuzhen
 *
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		//遥控器就是调用者，会传入一个命令对象，可以用来发出请求
		SimpleRemoteControl control = new SimpleRemoteControl();
		
		Command command = getLightCommand();
		//把命令传给调用者
		control.setCommand(command);
		control.buttonWasPressed();
		
		command = getGarageDoorCommand();
		control.setCommand(command);
		control.buttonWasPressed();
	}

	private static Command getLightCommand() {
		//现在创建一个电灯对象，此对象也就是请求的接受者
		Light light = new Light("Living Room");
		//在这里创建一个命令，然后将接收者传给命令
		LightOnCommand lightOn = new LightOnCommand(light);
		return lightOn;
	}
	
	private static Command getGarageDoorCommand() {
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorUpCommand command = new GarageDoorUpCommand(garageDoor);
		return command;
	}
}
