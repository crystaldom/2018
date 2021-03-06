package org.usfirst.frc.team4990.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;

public class Fork {
	private Solenoid solenoid;
	public Compressor compressor;
	
	public Fork(int pcmChannelNum) {
		this.solenoid = new Solenoid(pcmChannelNum);
		this.compressor = new Compressor(0);
		this.compressor.setClosedLoopControl(true);
	}
	
	public void setForkState(boolean isOpen) {
		System.out.println("state toggled!!!!!");
		this.solenoid.set(isOpen);
	}
}
