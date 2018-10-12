package com.remotecontrol.app;

import com.remotecontrol.app.commands.GarageCommandClose;
import com.remotecontrol.app.commands.GarageCommandOpen;
import com.remotecontrol.app.commands.LightCommandOff;
import com.remotecontrol.app.commands.LightCommandOn;
import com.remotecontrol.app.devices.DrawingRoomLight;
import com.remotecontrol.app.devices.GarageDoor;
import com.remotecontrol.app.devices.Light;
import com.remotecontrol.app.devices.RoomLight;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light roomLight = new RoomLight();
		Light drwaingRoomLight = new DrawingRoomLight();
		GarageDoor door = new GarageDoor();
		LightCommandOn roomLightCommandOn = new LightCommandOn(roomLight);
		LightCommandOn drawingLightCommandOn = new LightCommandOn(drwaingRoomLight);
		LightCommandOff roomLightCommandOff = new LightCommandOff(roomLight);
		LightCommandOff drawingLightCommandOff = new LightCommandOff(drwaingRoomLight);
		GarageCommandOpen garageOpen = new GarageCommandOpen(door);
		GarageCommandClose garageClose = new GarageCommandClose(door);
		rc.setCommand(0, roomLightCommandOn, roomLightCommandOff);
		rc.setCommand(1, drawingLightCommandOn, drawingLightCommandOff);
		rc.setCommand(2, garageOpen, garageClose);
		rc.pressOnButton(0);
		rc.pressOnButton(1);
		rc.pressOnButton(2);

	}

}
