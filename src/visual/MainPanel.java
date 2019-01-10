package visual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import mech.Constants;

@SuppressWarnings("serial")
public class MainPanel extends JPanel implements Constants{
	private final String exitStr = "exitStr";
	
	private ButtonPanel buttonPanel = new ButtonPanel(this);
	private ResultsPanel resultsPanel = new ResultsPanel();
	
	public MainPanel() {
		setLayout(null);
		setBackground(Color.WHITE);
				
		getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ESCAPE"), exitStr);
		getActionMap().put(exitStr, exitAction);
		
		this.add(buttonPanel);
		this.add(resultsPanel);
	}
	
	public ResultsPanel getResultsPanel(){
		return resultsPanel;
	}

	private Action exitAction = new AbstractAction() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	};
}