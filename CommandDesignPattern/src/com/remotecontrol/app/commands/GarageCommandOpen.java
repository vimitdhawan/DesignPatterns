package com.remotecontrol.app.commands;

import com.remotecontrol.app.devices.GarageDoor;

public class GarageCommandOpen implements Command{
	
	GarageDoor door;
	
	public GarageCommandOpen(GarageDoor door){
		this.door = door;
	}

	@Override
	public void execute() {
		door.open();
	}

	@Override
	public void undo() {
		door.close();
		
	}

}
