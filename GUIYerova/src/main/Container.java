package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Container extends JFrame{

	Container() {
		
		// JFrame = a GUI Window to add components to
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon logo = new ImageIcon("LogoYerova.png");	//create an ImageIcon
		JLabel label = new JLabel();	//create a label
		
		
		
		
		label.setText("Yerova is Programming"); //set text of Label
		label.setIcon(logo);	//set an image into the frame
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.BOTTOM); //set Text TOP, CENTER, BOTTOM of ImageIcon
		label.setForeground(new Color(0, 50, 250));	//set Color of Text
		label.setFont(new Font("PLAIN",Font.PLAIN,40)); //set Font of Text
		label.setIconTextGap(-20); //set gap between text and image
		
		
		
		this.add(label);
		this.setVisible(true);	//set the visibility of the frame
		this.setSize(1600, 800);	// Sets its Size
		this.setTitle("Yerova Programming...");	// Sets its Title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Exit out of application
		this.setIconImage(logo.getImage()); //change Icon of this
		this.getContentPane().setBackground(Color.LIGHT_GRAY); //change color of Background
	}
}











