

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	private double vY,vX;
	
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		
		vY = 0;
		vX=3;
	}

	// METHODS
	public void walk(int dir) {
		super.x +=10-dir;
	}

	public void jump() {
		super.x +=10;
		super.y +=10;
	}

	public void act(ArrayList<Shape> obstacles) {
		// FINISH ME!
		vY+= 0.69;
		super.y+=vY;
		super.x+=vX;
	}


}
