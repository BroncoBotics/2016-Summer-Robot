package org.usfirst.frc.team991.robot.triggers;


import org.usfirst.frc.team991.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ShootTrigger extends Trigger {
	
	int button1,button2;
	Joystick stick;
//	
	public ShootTrigger(Joystick stick, int button1, int button2) {
		this.button1 = button1;
		this.button2 = button2;
		this.stick = stick;
	}
	
    public boolean get() {
//    	return Robot.oi.getLeftBumper() && Robot.oi.getRightBumper();
    	return stick.getRawButton(button1) && stick.getRawButton(button2);
    }
}
/*
 * Warning at org.usfirst.frc.team991.robot.OI.<init>(OI.java:33): Joystick Button 1 on port 1 not available, check if controller is plugged in 
ERROR  1  ERROR Unhandled exception: java.lang.NullPointerException at [org.usfirst.frc.team991.robot.triggers.ShootTrigger.get(ShootTrigger.java:20), edu.wpi.first.wpilibj.buttons.Trigger.grab(Trigger.java:44), edu.wpi.first.wpilibj.buttons.Trigger.access$000(Trigger.java:26), edu.wpi.first.wpilibj.buttons.Trigger$1.<init>(Trigger.java:56), edu.wpi.first.wpilibj.buttons.Trigger.whenActive(Trigger.java:54), org.usfirst.frc.team991.robot.OI.<init>(OI.java:34), org.usfirst.frc.team991.robot.Robot.robotInit(Robot.java:21), edu.wpi.first.wpilibj.IterativeRobot.startCompetition(IterativeRobot.java:64), edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:247)]  edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:249) 
ERROR Unhandled exception: java.lang.NullPointerException at [org.usfirst.frc.team991.robot.triggers.ShootTrigger.get(ShootTrigger.java:20), edu.wpi.first.wpilibj.buttons.Trigger.grab(Trigger.java:44), edu.wpi.first.wpilibj.buttons.Trigger.access$000(Trigger.java:26), edu.wpi.first.wpilibj.buttons.Trigger$1.<init>(Trigger.java:56), edu.wpi.first.wpilibj.buttons.Trigger.whenActive(Trigger.java:54), org.usfirst.frc.team991.robot.OI.<init>(OI.java:34), org.usfirst.frc.team991.robot.Robot.robotInit(Robot.java:21), edu.wpi.first.wpilibj.IterativeRobot.startCompetition(IterativeRobot.java:64), edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:247)] 
WARNING: Robots don't quit! 
Warning at org.usfirst.frc.team991.robot.OI.<init>(OI.java:33): Joystick Button 1 on port 1 not available, check if controller is plugged in 
ERROR  1  ERROR Unhandled exception: java.lang.NullPointerException at [org.usfirst.frc.team991.robot.triggers.ShootTrigger.get(ShootTrigger.java:20), edu.wpi.first.wpilibj.buttons.Trigger.grab(Trigger.java:44), edu.wpi.first.wpilibj.buttons.Trigger.access$000(Trigger.java:26), edu.wpi.first.wpilibj.buttons.Trigger$1.<init>(Trigger.java:56), edu.wpi.first.wpilibj.buttons.Trigger.whenActive(Trigger.java:54), org.usfirst.frc.team991.robot.OI.<init>(OI.java:34), org.usfirst.frc.team991.robot.Robot.robotInit(Robot.java:21), edu.wpi.first.wpilibj.IterativeRobot.startCompetition(IterativeRobot.java:64), edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:247)]  edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:249) 
ERROR Unhandled exception: java.lang.NullPointerException at [org.usfirst.frc.team991.robot.triggers.ShootTrigger.get(ShootTrigger.java:20), edu.wpi.first.wpilibj.buttons.Trigger.grab(Trigger.java:44), edu.wpi.first.wpilibj.buttons.Trigger.access$000(Trigger.java:26), edu.wpi.first.wpilibj.buttons.Trigger$1.<init>(Trigger.java:56), edu.wpi.first.wpilibj.buttons.Trigger.whenActive(Trigger.java:54), org.usfirst.frc.team991.robot.OI.<init>(OI.java:34), org.usfirst.frc.team991.robot.Robot.robotInit(Robot.java:21), edu.wpi.first.wpilibj.IterativeRobot.startCompetition(IterativeRobot.java:64), edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:247)] 
WARNING: Robots don't quit! 
Warning at org.usfirst.frc.team991.robot.OI.<init>(OI.java:33): Joystick Button 1 on port 1 not available, check if controller is plugged in 
ERROR  1  ERROR Unhandled exception: java.lang.NullPointerException at [org.usfirst.frc.team991.robot.triggers.ShootTrigger.get(ShootTrigger.java:20), edu.wpi.first.wpilibj.buttons.Trigger.grab(Trigger.java:44), edu.wpi.first.wpilibj.buttons.Trigger.access$000(Trigger.java:26), edu.wpi.first.wpilibj.buttons.Trigger$1.<init>(Trigger.java:56), edu.wpi.first.wpilibj.buttons.Trigger.whenActive(Trigger.java:54), org.usfirst.frc.team991.robot.OI.<init>(OI.java:34), org.usfirst.frc.team991.robot.Robot.robotInit(Robot.java:21), edu.wpi.first.wpilibj.IterativeRobot.startCompetition(IterativeRobot.java:64), edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:247)]  edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:249) 
ERROR Unhandled exception: java.lang.NullPointerException at [org.usfirst.frc.team991.robot.triggers.ShootTrigger.get(ShootTrigger.java:20), edu.wpi.first.wpilibj.buttons.Trigger.grab(Trigger.java:44), edu.wpi.first.wpilibj.buttons.Trigger.access$000(Trigger.java:26), edu.wpi.first.wpilibj.buttons.Trigger$1.<init>(Trigger.java:56), edu.wpi.first.wpilibj.buttons.Trigger.whenActive(Trigger.java:54), org.usfirst.frc.team991.robot.OI.<init>(OI.java:34), org.usfirst.frc.team991.robot.Robot.robotInit(Robot.java:21), edu.wpi.first.wpilibj.IterativeRobot.startCompetition(IterativeRobot.java:64), edu.wpi.first.wpilibj.RobotBase.main(RobotBase.java:247)] 
WARNING: Robots don't quit! 

 * 
 */
