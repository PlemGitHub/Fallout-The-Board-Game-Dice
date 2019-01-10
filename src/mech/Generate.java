package mech;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visual.ButtonPanel;

public class Generate implements ActionListener, Constants {
	
	private ButtonPanel buttonPanel;
	private int[] rolls;

	public Generate(ButtonPanel buttonPanel) {
		this.buttonPanel = buttonPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(buttonPanel.getRollButton())){
			rolls = new int[7];
			for (int i = 0; i < DICE_ROLLS; i++) {
				int result = 0;
				for (int j = 0; j < DICE_NUMBER; j++) {
					int diceSide = (int)(Math.random()*6);
					result += PROBS[diceSide];
				}
				rolls[result]++;
			}
			
			double[] rollsD = new double[rolls.length];
			for (int i = 0; i < rolls.length; i++) {
				rollsD[i] = (double)rolls[i]/(DICE_ROLLS/100);;
				buttonPanel.getMainPanel().getResultsPanel().setRolls(rollsD);
			}
		}
	}

}
