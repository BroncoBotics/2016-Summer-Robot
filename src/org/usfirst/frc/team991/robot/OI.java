package org.usfirst.frc.team991.robot;

import org.usfirst.frc.team991.robot.commands.Load;
import org.usfirst.frc.team991.robot.commands.Shoot;
import org.usfirst.frc.team991.robot.triggers.ShootTrigger;

import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
     Joystick stick = new Joystick(0);
     
     Button rightBumper = new JoystickButton(stick, 5);
     Button leftBumper = new JoystickButton(stick, 6);
     
     public Joystick getJoystick() {
    	 return stick;
     }
     
     
     
     
     Trigger shoot = new ShootTrigger(stick, 5, 6);
//     Trigger shoot2 = new JoystickButton(stick, 5);
     Button aButton = new JoystickButton(stick, 1);
    
     public OI() {
    	 
    	 aButton.whenPressed(new Load());
    	 //shoot.whenActive(new Shoot());
    	 shoot.whenActive(new Shoot());
     }
     
     public void rumble(float l, float r) {
		stick.setRumble(RumbleType.kLeftRumble, l);
		stick.setRumble(RumbleType.kRightRumble, r);
	}
}

