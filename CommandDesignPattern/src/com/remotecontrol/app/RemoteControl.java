package com.remotecontrol.app;

import com.remotecontrol.app.commands.Command;
import com.remotecontrol.app.commands.NoCommand;

public class RemoteControl {
	
	Command onCommands[] ;
	Command offCommands[] ;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		undoCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void pressOnButton(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void pressOffButton(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void pressUndo(){
		undoCommand.undo();
	}
}
