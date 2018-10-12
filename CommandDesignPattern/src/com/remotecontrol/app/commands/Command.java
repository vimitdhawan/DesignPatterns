package com.remotecontrol.app.commands;

public interface Command {
	public void execute();
	
	public void undo();

}
