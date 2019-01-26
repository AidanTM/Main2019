package org.usfirst.frc1803.Main2019;

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static int leftFrontDrivetrainMotor = 1; //This is a box.
	public static int leftBackDrivetrainMotor = 2; //This is a shoe.
	
	public static int rightFrontDrivetrainMotor = 3; //This is how I kill you.
    public static int rightBackDrivetrainMotor = 4; //And get the victory royale.
    
    public static int controllerPortA = 0;
	public static int controllerPortB = 1;
	
	public static int compressorPortIn = 6;
	public static int compressorPortOut = 7;

	public static int intakeLeft = 6;
	public static int intakeRight = 7;
}
