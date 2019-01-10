package visual;

import javax.swing.JLabel;
import javax.swing.JPanel;

import mech.Constants;

public class ResultsPanel extends JPanel implements Constants{
	private static final long serialVersionUID = 1L;
	
	private JLabel[] rollsLbl = new JLabel[7];	
	
	public ResultsPanel() {
		setLayout(null);
		setLocation(0, BUTTON_HEIGHT);
		setSize(WINDOW_WIDTH, BUTTON_HEIGHT);
		createLabels();
	}

	private void createLabels() {
		int i = -1;
		for (JLabel jL : rollsLbl) {
			i++;
			jL = new JLabel();
			rollsLbl[i] = jL;
			jL.setText(Integer.toString(i));
			jL.setHorizontalAlignment(JLabel.CENTER);
			jL.setSize(BUTTON_WIDTH/2, BUTTON_HEIGHT);
			jL.setLocation(BUTTON_WIDTH/2*i, 0);
			this.add(jL);
		}
	}
	
	public void setRolls(double[] rolls){
		for (int i = 0; i < rolls.length; i++) {
			String text = Double.toString(rolls[i]);
			int div = text.indexOf('.');
			text = (rolls[i] == 0)? text:text.substring(0, div+3);
			text = "<html><center>"+i+"<br>"+text+"</center></html>";
			rollsLbl[i].setText(text);
		}
	}
}
