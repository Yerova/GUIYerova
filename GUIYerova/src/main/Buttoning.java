package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttoning {
	
	//JButton = a button that performs an action when clicked on
	
	JButton button;
	
	Buttoning() {
		
		
		UsefulGUI myUsefulGui = new UsefulGUI();
		
		JFrame frame = myUsefulGui.frameCreator(true);
		
		button = new JButton();
		button.setBounds(750, 370, 400, 160);
		button.setText("Dont click!");
		button.setFocusable(false);
		button.setBackground(Color.DARK_GRAY);
		
		button.addActionListener(e -> System.out.println("HEY! HEY! YOU CLICKED ON ME, YOU MOTHERFUCKER!"));
	
		frame.add(button);
		
		
		
		
	}
}
