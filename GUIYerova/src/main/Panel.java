package main;

import java.awt.Color;
//import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

		//JPanel a GUI component that funktions as container to hold other components

	
	Panel() {		
		
		JLabel label = new JLabel();
		
		UsefulGUI myUsefulGui = new UsefulGUI();
		JFrame frame = myUsefulGui.frameCreator(true);
		
		JPanel panel1 = myUsefulGui.panelCreator(54, 100, 139, 0, 0, 400, 400);
		JPanel panel2 = myUsefulGui.panelCreator(137, 104, 205, 400, 0, 400, 400);
		JPanel panel3 = myUsefulGui.panelCreator(238, 173, 014, 0, 400, 400, 400);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		
	}
	
	
	
}
