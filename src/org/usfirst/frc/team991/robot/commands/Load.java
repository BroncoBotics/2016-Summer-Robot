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
        System.out.println("poteasdjfdaifmadjfad");
    }

    protected void initialize() {
    	Robot.cannon.loadOn();
    	System.out.println("fthsdnjlsvdkjnvs");
    }

    protected void execute() {}

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.cannon.loadOff();
    	new Rumble().start();
    }

    protected void interrupted() {
    	end();
    }
}
