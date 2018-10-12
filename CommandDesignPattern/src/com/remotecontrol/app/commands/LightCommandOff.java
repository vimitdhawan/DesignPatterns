package com.remotecontrol.app.commands;

import com.remotecontrol.app.devices.Light;

public class LightCommandOff implements Command {
	
	Light light;
	
	public LightCommandOff(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
		
	}

}
