package com.remotecontrol.app.commands;

import com.remotecontrol.app.devices.Light;

public class LightCommandOn implements Command {
	
	Light light;
	
	public LightCommandOn(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}

}
