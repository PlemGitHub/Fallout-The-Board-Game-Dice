package mech;

import java.awt.GraphicsEnvironment;
public interface Constants {
	
	int WINDOW_WIDTH = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	int WINDOW_HEIGHT = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	
	int BUTTON_HEIGHT = WINDOW_HEIGHT / 10;
	int BUTTON_WIDTH = BUTTON_HEIGHT * 3;
	
	int DICE_ROLLS = 1000000;
	
	int DICE_NUMBER = 3;
	
	
	int[] PROBS = {0, 0, 1, 1, 1, 2};
}
