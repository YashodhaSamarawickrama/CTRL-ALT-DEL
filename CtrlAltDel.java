
import robocode.*;

import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * CtrlAltDel - a robot by (your name here)
 */
public class CtrlAltDel extends AlphaBot
{
	/**
	 * run: CtrlAltDel's default behavior
	 */
	int turnDirection = 1; // Clockwise or counterclockwise	

	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.black,Color.white,Color.black); // body,gun,radar

		// Robot main loop
		ahead(1500);		

		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(300);
			turnRight(360);
			
			turnGunRight(360);
			turnRight(360);
			
			ahead(300);
			turnGunRight(360);
			turnLeft(360);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		

	
	if (e.getBearing() >= 0) {
			turnDirection = 1;
		} else {
			turnDirection = -1;
		}
		turnRight(e.getBearing());

		//fire
		if (e.getDistance() < 75) {
           	fire(3);
       	} 
		else {
           fire(1);
		   }
		ahead(40);

	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		//back(100);
		//turnRight(270);
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		//back(100);
		turnRight(720);
		ahead(50);

	}	
}
