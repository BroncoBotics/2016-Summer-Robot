package org.usfirst.frc.team991.robot.commands;

import org.usfirst.frc.team991.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Rumble extends Command {

    public Rumble() {
    	setTimeout(0.5);
    }
    
    protected void initialize() {
    	Robot.oi.rumble(1, 1);
    }

    protected void execute() {}

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.oi.rumble(0, 0);
    }

    protected void interrupted() {
    	end();
    }
}
