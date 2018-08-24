package org.usfirst.frc.team991.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
	// Motors
	public static int BackLeft = 0;
	public static int FrontLeft = 1;
	public static int BackRight = 2;
	public static int FrontRight = 3;
	
    
    // Pneumatics
	public static int loader = 0;
	public static int shooter = 1;
	
	// Timeouts
	public static int loadTimeout = 3;
	public static int shootTimeout = 3;
	
	
	public static int pivot = 4;
	

}
