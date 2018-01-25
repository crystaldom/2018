package org.usfirst.frc.team4990.robot.controllers;

import org.usfirst.frc.team4990.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4990.robot.controllers.AutoDriveTrainScripter;

public class SimpleAutoDriveTrainScripter extends AutoDriveTrainScripter {
	
	public enum StartingPosition {LEFT, MID, RIGHT};
	
	protected void init() {
		StartingPosition position = StartingPosition.LEFT;
		switch(position) {
		case LEFT:
			break;
		case MID:
			break;
		case RIGHT:
			break;
		}
	}
	
	// Do not modify below por favor (this means "please" in Spanish)
	public SimpleAutoDriveTrainScripter(DriveTrain dtrain) {
		super(dtrain);
		this.init();
	}
	
	public void update() {
		super.update();
	}

}