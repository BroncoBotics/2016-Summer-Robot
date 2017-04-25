package org.usfirst.frc.team991.robot.subsystems;

import org.usfirst.frc.team991.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cannon extends Subsystem {
	
	SpeedController pivot = new Talon(RobotMap.pivot);
	
	Solenoid loader = new Solenoid(RobotMap.loader);
	Solenoid shooter = new Solenoid(RobotMap.shooter);
	
	public void setPivot(double speed) {
		pivot.set(speed);
	}
	
	public void shootOn() {
		shooter.set(true);
	}
	
	public void shootOff() {
		shooter.set(false);
	}
	
	public void loadOn() {
		loader.set(true);
	}
	
	public void loadOff() {
		loader.set(false);
	}

    public void initDefaultCommand() {}
}

