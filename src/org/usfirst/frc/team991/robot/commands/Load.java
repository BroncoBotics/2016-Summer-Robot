package org.usfirst.frc.team991.robot.commands;

import org.usfirst.frc.team991.robot.Robot;
import org.usfirst.frc.team991.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Load extends Command {

    public Load() {
        requires(Robot.cannon);
        setInterruptible(false);
        setTimeout(RobotMap.loadTimeout);
    }

    protected void initialize() {
    	Robot.cannon.loadOn();
    }

    protected void execute() {}

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.cannon.loadOff();
    	new Rumble().start();
    }

    protected void interrupted() {
    	end();
    }
}
