// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1803.Main2019.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GyroscopeSubsystem extends Subsystem {

    //Identify the gyro variable and other values.
    ADXRS450_Gyro gyro;
    
    double turnGoal;
    boolean isTurning;

    public GyroscopeSubsystem() {

    }

    @Override
    public void initDefaultCommand() {
        gyro = new ADXRS450_Gyro(Port.kOnboardCS0);

        if (gyro == null) return;
        
	    gyro.calibrate();
	    SmartDashboard.putNumber("Gyro", getAngle());
        DriverStation.reportWarning("Gyro calibrated.", false);
        
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    /**
     * Gets the value of the gyro's angle
     * @return The angle of the gyro as a value from ???-???
     */
    public double getAngle()
    {
    	return gyro.getAngle();
    }
    
    /**
     * Gets if the robot is turning.
     * @return Boolean if the robot is turning.
     */
    public boolean isTurning()
    {
    	return isTurning;
    }
    
    /**
     * Sets the gyro's value to zero.
     */
    public void resetAngle()
    {
    	gyro.reset();
    }
    
    /**
     * Sets up the gyro.
     */
    public void calibrate()
    {
    	gyro.calibrate();
    }
}

