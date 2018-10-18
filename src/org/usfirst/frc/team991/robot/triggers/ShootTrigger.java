package org.usfirst.frc.team991.robot.triggers;

import org.usfirst.frc.team991.robot.Robot;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ShootTrigger extends Trigger {
	
	int button1, button2;
	
	public ShootTrigger(int button1, int button2) {
		this.button1 = button1;
		this.button2 = button2;
	}
	
    public boolean get() {
        return Robot.oi.getJoystick().getRawButton(button1) && Robot.oi.getJoystick().getRawButton(button2);
    }
}
