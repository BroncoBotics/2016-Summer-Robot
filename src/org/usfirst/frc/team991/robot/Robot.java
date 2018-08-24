
package org.usfirst.frc.team991.robot;

import org.usfirst.frc.team991.robot.subsystems.Cannon;
import org.usfirst.frc.team991.robot.subsystems.Pneumatics;
import org.usfirst.frc.team991.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	
	public static Drivetrain drivetrain;
	public static Pneumatics compressor;
	public static Cannon cannon;
	public static OI oi;

    public void robotInit() {
    	drivetrain = new Drivetrain();
    	compressor = new Pneumatics();
    	cannon = new Cannon();
    	oi = new OI();
    }
    
    public void disabledInit(){}
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
        SmartDashboard.putNumber("PSI", compressor.getPSI());
	}
    public void autonomousInit() {}

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {}

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("PSI", compressor.getPSI());
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
