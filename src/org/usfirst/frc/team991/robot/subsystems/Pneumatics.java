package org.usfirst.frc.team991.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
	
	private Compressor compressor = new Compressor();
	private AnalogInput psiSensor = new AnalogInput(0);
	
    public void initDefaultCommand() {}
    
    public void start() {
		compressor.start();
	}
    
    public double getPSI() {
    	return 50 * psiSensor.getAverageVoltage() - 25 ;
    }
    public Compressor getComp() {
    	return compressor;
    }
}

