package com.remotecontrol.app.commands;

import com.remotecontrol.app.devices.GarageDoor;

public class GarageCommandClose implements Command{
	
	GarageDoor door;
	
	public GarageCommandClose(GarageDoor door){
		this.door = door;
	}

	@Override
	public void execute() {
		door.close();
	}

	@Override
	public void undo() {
		door.open();
		
	}

}
