import robocode.*;

import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * CtrlAltDel - a robot by (your name here)
 */
public class CtrlAltDel extends CharlieBot
{
	/**
	 * run: CtrlAltDel's default behavior
	 */
	int turnDirection = 1; // Clockwise or counterclockwise	

	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.yellow,Color.white,Color.black); // body,gun,radar

		
		// Robot main loop
		//ahead(1500);		
		//turnGunRight(0);
	
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(400);
			turnRight(70);
			turnGunRight(70);
			back(200);
			turnLeft(70);
			turnGunRight(70);
			//turnRadarRight(180);
			//turnGunRight(90);
		
		}
	}