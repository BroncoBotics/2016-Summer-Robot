package org.usfirst.frc.team991.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
	
	Compressor compressor = new Compressor();
	AnalogInput psiSensor = new AnalogInput(0);
	
    public void initDefaultCommand() {}
    
    public double getPSI() {
    	return 50 * psiSensor.getAverageVoltage() - 25 ;
    }
}

