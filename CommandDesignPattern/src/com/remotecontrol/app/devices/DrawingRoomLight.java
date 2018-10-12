package com.remotecontrol.app.devices;

public class DrawingRoomLight implements Light {

	@Override
	public void on() {
		System.out.println("Drwaing room Light On");
		
	}

	@Override
	public void off() {
		System.out.println("Drwaing room Light Off");
		
	}

}
