package org.usfirst.frc.team991.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
	// Motors
	public static int leftMotor = 1;
	public static int rightMotor = 2;
	public static int pivot = 2;
    
    // Pneumatics
	public static int loader = 1;
	public static int shooter = 1;
	
	// Timeouts
	public static int loadTimeout = 1;
	public static int shootTimeout = 1;
}
