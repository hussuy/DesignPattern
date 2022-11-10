package com.desginpattern.command;

class MainEntry {

    public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Button lampBtn = new Button(lampOnCommand);
		lampBtn.pressed();
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(alarm);
		
		Button alarmBtn = new Button(alarmOnCommand);
		alarmBtn.pressed();
		
		alarmBtn.setCommand(lampOnCommand);
		alarmBtn.pressed();

	
 
    }
}
