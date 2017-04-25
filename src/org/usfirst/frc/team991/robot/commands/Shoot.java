package org.usfirst.frc.team991.robot.commands;

import org.usfirst.frc.team991.robot.Robot;
import org.usfirst.frc.team991.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {

    public Shoot() {
        requires(Robot.cannon);
        setInterruptible(false);
        setTimeout(RobotMap.shootTimeout);
    }

    protected void initialize() {
    	Robot.cannon.shootOn();
    }

    protected void execute() {}

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.cannon.shootOff();
    }

    protected void interrupted() {
    	end();
    }
}
