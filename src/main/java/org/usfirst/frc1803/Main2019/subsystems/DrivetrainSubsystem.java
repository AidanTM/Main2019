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


import org.usfirst.frc1803.Main2019.*;
import org.usfirst.frc1803.Main2019.commands.DriveCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.PIDOutput;
//import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DrivetrainSubsystem extends Subsystem {

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//These are the four motors that make up the drivetrain subsystem.
	//We will group them up later.
	Spark leftFront;
	Spark leftBack;
	Spark rightFront;
	Spark rightBack;
	
	//Each SpeedControllerGroup will hold two motors. We have two
	//groups for the left and right side.
	SpeedControllerGroup left;
	SpeedControllerGroup right;
	
	//This connects the two SpeedControllerGroups together, creating one union
	//drivetrain with four motors.
	public DifferentialDrive drivetrain;

    public DrivetrainSubsystem() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        
    	//Set the motor variables to the Spark (A type of Speed controller) class.
    	//The input comes from the RobotMap class and contains the port of the controllers.
    	//The ports can be found on the RoboRIO.
        leftFront = new Spark(RobotMap.leftFrontDrivetrainMotor);
    	leftBack = new Spark(RobotMap.leftBackDrivetrainMotor);
    	rightFront = new Spark(RobotMap.rightFrontDrivetrainMotor);
    	rightBack = new Spark(RobotMap.rightBackDrivetrainMotor);
    	
    	//Connect each side of motors together.
    	left = new SpeedControllerGroup(leftFront, leftBack);
    	right = new SpeedControllerGroup(rightFront, rightBack);
    	
    	//Connect everything together.
    	drivetrain = new DifferentialDrive(left, right);
    	
    	//Who cares about safety? (In all seriousness: This is so the robot won't shut
    	//itself down if there is too much power being taken in.)
    	leftFront.setSafetyEnabled(false);
    	leftBack.setSafetyEnabled(false);
    	rightFront.setSafetyEnabled(false);
		rightBack.setSafetyEnabled(false);
    	drivetrain.setSafetyEnabled(false);
    	
    	//Set the command that runs automatically.
    	//The DriveCommand gets the input for movement.
    	setDefaultCommand(new DriveCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
		
	}
	
	public void Drive(double y, double x) {
    	//drivetrain.arcadeDrive(y, x);
        //drivetrain.curvatureDrive(y, x + (x * 1.2), true);
		//drivetrain.arcadeDrive(y, x);
		drivetrain.curvatureDrive(y, x + (x * 1.2), true);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

