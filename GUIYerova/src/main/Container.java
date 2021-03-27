package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Container extends JFrame{

	Container() {
		
		// JFrame = a GUI Window to add components to
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon logo = new ImageIcon("LogoYerova.png");	//create an ImageIcon
		
		
		UsefulGUI myUsefulGui = new UsefulGUI();
		
		
		
		
		JLabel label = myUsefulGui.labelCreator(141, 238, 238, 0, 0, 400, 400);
		label.setText("Yerova is Programming"); 
		label.setIcon(logo);	
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setVerticalTextPosition(JLabel.BOTTOM); 
		
		JPanel panel = myUsefulGui.panelCreator(156, 156, 156, 20, 0, 400, 400);
		JFrame frame = myUsefulGui.frameCreator(false);

		
		
		
		
		panel.add(label);
		frame.add(panel);
		
		
		
		
		
	}
}











