package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UsefulGUI {
	
	JFrame frame;	
	JPanel panel;
	JLabel label;
	
	public JLabel labelCreator(int r, int g, int b, int x, int y, int height, int width) {
		label = new JLabel();
		label.setForeground(new Color(r, g, b));
		label.setBounds(x, y, height, width);
		
		return label;
	}
	
	public JPanel panelCreator(int r, int g, int b, int x, int y, int height, int width) {
		panel = new JPanel();
		panel.setBackground(new Color(r, g, b));
		panel.setBounds(x, y, height, width);
		
		return panel;
	}
	
	public JFrame frameCreator(boolean layout) {
		ImageIcon logo = new ImageIcon("LogoYerova.png");	//create an ImageIcon
		
		frame = new JFrame();
		frame.setVisible(true);	//set the visibility of the frame
		frame.setSize(1600, 800);	// Sets its Size
		frame.setTitle("Yerova Programming...");	// Sets its Title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Exit out of application
		frame.setIconImage(logo.getImage()); //change Icon of frame
		frame.getContentPane().setBackground(Color.LIGHT_GRAY); //change color of Background
		
		if(layout = true) {
			frame.setLayout(null);	
		}
		
		return frame;
	}
}
