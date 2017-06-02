package com.pattern.command.client;

import com.pattern.command.impl.CeilingFanHighCommand;
import com.pattern.command.impl.CeilingFanMediumCommand;
import com.pattern.command.impl.CeilingFanOffCommand;
import com.pattern.command.impl.CeilingFanOnCommand;
import com.pattern.command.impl.GarageDoorDownCommand;
import com.pattern.command.impl.GarageDoorUpCommand;
import com.pattern.command.impl.HottubOnCommand;
import com.pattern.command.impl.LightOffCommand;
import com.pattern.command.impl.LightOnCommand;
import com.pattern.command.impl.StereoOffCommand;
import com.pattern.command.impl.StereoOnWithCDCommand;
import com.pattern.command.impl.TVOnCommand;
import com.pattern.command.invoker.RemoteControl;
import com.pattern.command.invoker.RemoteControlWithUndo;
import com.pattern.command.receiver.CeilingFan;
import com.pattern.command.receiver.GarageDoor;
import com.pattern.command.receiver.Hottub;
import com.pattern.command.receiver.Light;
import com.pattern.command.receiver.Stereo;
import com.pattern.command.receiver.TV;

public class RemoteLoader {

	public static void main(String[] args) {
//		testRemoteControl();
//		testRemoteControlWithUndo();
//		testRemoteControlWithUndo2();
		
		testMacroCommand();
	}
	
	private static void testMacroCommand() {
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand huttubOn = new HottubOnCommand(hottub);
		
		
		
	}

	private static void testRemoteControlWithUndo2() {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanHighCommand ceilingFanMedium = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanHigh = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
	}

	private static void testRemoteControlWithUndo() {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}

	private static void testRemoteControl() {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorOpen, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}
}
