package com.remotecontrol.app.devices;

public class RoomLight implements Light{
	
	public void on(){
		System.out.println("Room light on");
	}
	
	public void off() {
		System.out.println("Room light off");
	}

}
