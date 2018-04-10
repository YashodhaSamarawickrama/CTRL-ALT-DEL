
import robocode.*;

import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 *A robot by CtrlAltDel 
 */
public class CtrlAltDel extends CharlieBot
{
	/**
	 * run: CtrlAltDel's default behavior
	 */
	int turnDirection = 1; // Clockwise or counterclockwise	

	public void run() {
		

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

	/**
	 * onScannedRobot: What to do when it sees another robot
	 */
		

	public void onRobotDetected(ScannedRobotEvent e) {
		
		stop();
		turnGunLeft(210);
		
	/*	if(e.getDistance()<100){
			if (e.getBearing() >= 0) {
				turnDirection = 1;
			} else {
				turnDirection = -1;
			}
			turnRight(e.getBearing());
			ahead(150);
			turnGunLeft(e.getBearing());
			fire(2);
			
		}*/
		//fire
		if (e.getDistance() <= 75 && getEnergy()>=20) {
           	fire(3);
       	} 
		else {
           fire(1);
		   }
		
		resume();
	}

	/**
	 * onHitByBullet: What to do when it is hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		
		//back(100);
		turnRight(10);
		//turnGunRight(10);
		ahead(100);
		
	}
	
	/**
	 * onHitWall: What to do when it hits a wall
	 */
	public void onHitWall(HitWallEvent e) {
		
		//back(100);
		turnRight(90);
		//turnGunRight(90);
		//turnRadarRight(360);
		ahead(50);

	}	
}
