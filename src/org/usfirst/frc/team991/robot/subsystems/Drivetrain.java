package org.usfirst.frc.team991.robot.subsystems;

import org.usfirst.frc.team991.robot.RobotMap;
import org.usfirst.frc.team991.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	RobotDrive drive = new RobotDrive(RobotMap.BackLeft, RobotMap.FrontLeft, RobotMap.BackRight, RobotMap.FrontRight);
	
	public void arcadeDriveTrigger(double right_trigger, double left_trigger, double rot) {
		drive.arcadeDrive((right_trigger - left_trigger), 0.4 * rot, false);
	}
	
	public void stop() {
		drive.arcadeDrive(0,0);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive());
    }
}

