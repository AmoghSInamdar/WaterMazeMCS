package backEnd;

import java.io.Serializable;

public class PhysData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	static int steps = 60;
	static double stepSize = 1.5;
	public static int diameter = 15;
	public static int radius = diameter/2;
	static int maxCues = 10;
	static int maxSubjects = 10;

	PathType center;
	
	public double centerDist(double x, double y) { // distance of (x,y) from center of the arena
		return Math.sqrt(Math.pow(center.x-x,2) + Math.pow(center.y-y,2)); 
	}
	
	double degToRad(int angle) { // convert degree to radian	
		return angle*3.14159/180;
	}

	int radToDeg(double angle) {	
		return (int)(angle*180/3.14159);
	}		
}