package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	/*
		Each motor is initialized as the appropriate class. Each motor is its own object (variable).
		Example, our build used the TalonSRX, so the right class to use is CANTalon. If you used regular
		Talons, you would use the Talon class.
	 */
	private CANTalon mLeftMotor;
	private CANTalon mLeftBackMotor;
	private CANTalon mRightMotor;
	private CANTalon mRightBackMotor;
	
	private RobotDrive myRobot;

	
	public DriveTrain() {
		//motor = new CANTAlon(port number);
		//Remember in RobotMap when we learned RobotMap.cLeftMotor is actually just the number 2?
		//The line below is the same thing as: mLeftMotor = new CANTalon(2);

		mLeftMotor = new CANTalon(RobotMap.cLeftMotor);
		mLeftBackMotor = new CANTalon(RobotMap.cLeftBackMotor);
		mRightMotor = new CANTalon(RobotMap.cRightMotor);
		mRightBackMotor = new CANTalon(RobotMap.cRightBackMotor);

		//RobotDrive takes the following port numbers:
		//RobotDrive(left back, left front, right back, right front)
		myRobot = new RobotDrive(mLeftBackMotor, mLeftMotor, mRightBackMotor, mRightMotor);
	}
		
	public void initDefaultCommand() {
		setDefaultCommand(new DriveJoystick());
	}

	/**
	 * @param leftAxisY Move value from -1 to 1
	 * @param leftAxisX Rotate Value from -1 to 1
	 * @param b Sensitivity
	 */
	public void arcadeDrive(double leftAxisY, double leftAxisX, boolean b) {
		/*
			arcadeDrive is a default function that will power the motors in the correct way
			to get the robot moving based on the joystick input. It will drive exactly how you would
			expect a car in any video game.
		*/
		myRobot.arcadeDrive(leftAxisY, leftAxisX, true);
	}
	
}