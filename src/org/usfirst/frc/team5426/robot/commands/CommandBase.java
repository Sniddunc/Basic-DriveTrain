package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5426.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.command.Command;


/**
 * All subsystems need to be initialized in this file first.
 */
public abstract class CommandBase extends Command {

	public static ExampleSubsystem exampleSubsystem;
	public static DriveTrain driveTrain;
	
	public static void init() {
		exampleSubsystem = new ExampleSubsystem();
		driveTrain = new DriveTrain();
	}
	
	public CommandBase(String name) {
		super(name);
	}
	
	public CommandBase() {
		super();
	}
}
