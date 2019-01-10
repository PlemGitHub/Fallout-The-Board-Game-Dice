package visual;

import javax.swing.JButton;
import javax.swing.JPanel;

import mech.Constants;
import mech.Generate;

public class ButtonPanel extends JPanel implements Constants{
	private static final long serialVersionUID = 1L;
	
	private MainPanel mainPanel;
	private JButton rollBtn = new JButton("Generate " +Integer.toString(DICE_ROLLS)+ " rolls");
	private JButton clearBtn = new JButton("Clear");
	private Generate generate = new Generate(this);
	

	public ButtonPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
		setLayout(null);
		setLocation(0, 0);
		setSize(WINDOW_WIDTH, BUTTON_HEIGHT);
		
		createButtons();
	}

	private void createButtons() {
		rollBtn.setLocation(0, 0);
		rollBtn.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		rollBtn.addActionListener(generate);
		
		clearBtn.setLocation(BUTTON_WIDTH, 0);
		clearBtn.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		
		this.add(rollBtn);
		this.add(clearBtn);
	}
	
	public JButton getRollButton(){
		return rollBtn;
	}
	
	public JButton getClearButton(){
		return clearBtn;
	}
	
	public MainPanel getMainPanel(){
		return mainPanel;
	}
}
