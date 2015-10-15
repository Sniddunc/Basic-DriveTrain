package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick stick = new Joystick(0);

    /**
     * @return Value of the left analog Y axis
     */
    public static double getLeftAxisY(){
    	return -stick.getRawAxis(1);
    }
    
    /**
     * @return Value of the left analog X axis
     */
    public static double getLeftAxisX(){
    	return -stick.getRawAxis(0);
    	//return -stick.getRawAxis(2); //Logitech
    }
    
    /**
     * @return Value of the right analog Y axis
     */
    public static double getRightAxisY(){
    	return stick.getRawAxis(5);
    }
    
    
    /**
     * @return Value of the right analog X axis
     */
    public static double getRightAxisX(){
    	return stick.getRawAxis(4);
    }
    
    public static double squareInput(double n){
		if (n > 0)
			n = Math.pow(n, 2);
		else
			n = -1 * Math.pow(n, 2);
		
		return n;
    }
      
}