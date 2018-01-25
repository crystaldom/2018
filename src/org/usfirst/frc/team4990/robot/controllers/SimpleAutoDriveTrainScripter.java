package org.usfirst.frc.team4990.robot.controllers;

import org.usfirst.frc.team4990.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4990.robot.controllers.AutoDriveTrainScripter;

public class SimpleAutoDriveTrainScripter extends AutoDriveTrainScripter {
	
	public enum StartingPosition {LEFT, MID, RIGHT};
	
	protected void init(StartingPosition s) {
		StartingPosition position = StartingPosition.LEFT;
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.charAt(0) == 'L') {//Left side is ours
			switch(position) {
				case LEFT:
					break;
				case MID:
					break;
				case RIGHT:
					break;
			}
		}
		else if (gameData.charAt(0) == 'R') {//Right 
			switch(position) {
				case LEFT:
					break;
				case MID:
					break;
				case RIGHT:
					break;
			}
		}
		else {
			System.out.println("YA MESSED UP PPL IDK WHAT HAPPENED THO HERE'S WHAT I GOT: " + gameData.charAt(0));
		}
	}
	
	// Do not modify below por favor (this means "please" in Spanish)
	public SimpleAutoDriveTrainScripter(DriveTrain dtrain, StartingPosition s) {
		super(dtrain);
		this.init(s);
	}
	
	public void update() {
		super.update();
	}

}