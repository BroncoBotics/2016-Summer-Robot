package org.usfirst.frc.team991.robot.commands;

import org.usfirst.frc.team991.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {

    public ArcadeDrive() {
         requires(Robot.drivetrain);
    }

    protected void initialize() {}

    protected void execute() {
    	Robot.drivetrain.arcadeDriveTrigger(Robot.oi.getJoystick().getRawAxis(2),
    			Robot.oi.getJoystick().getRawAxis(3),
    			Robot.oi.getJoystick().getRawAxis(4));
    	Robot.cannon.setPivot(Robot.oi.getJoystick().getRawAxis(1));
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    }

    protected void interrupted() {
    	end();
    }
}
