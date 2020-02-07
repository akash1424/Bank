import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JLabel label=new JLabel("Welcome to bank");
	
	public Login()
	{
		
		frame.setSize(1000,700);
		frame.setVisible(true);
		panel.setBackground(Color.darkGray);
		frame.add(panel);
		label.setSize(100,100);
		frame.add(label);
		
		
	}
}
