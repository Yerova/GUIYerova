package main;

import java.awt.Color;
//import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{

		//JPanel a GUI component that funktions as container to hold other components

	public static JPanel panelCreator(int r, int g, int b, int x, int y, int height, int width) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(r, g, b));
		panel.setBounds(x, y, height, width);
		
		return panel;
	}
	Panel() {
		ImageIcon logo = new ImageIcon("LogoYerova.png");	//create an ImageIcon
	
		this.setLayout(null);		
		this.add(panelCreator(54, 100, 139 , 0, 0, 400, 400));
		this.add(panelCreator(137, 104, 205 , 400, 0, 400, 400));
		this.add(panelCreator(238, 173, 014, 0, 400, 400, 400));
		
		this.setVisible(true);	//set the visibility of the frame
		this.setSize(1600, 800);	// Sets its Size
		this.setTitle("Yerova Programming...");	// Sets its Title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Exit out of application
		this.setIconImage(logo.getImage()); //change Icon of this
		this.getContentPane().setBackground(Color.LIGHT_GRAY); //change color of Background
		
		
		
	}
	
	
	
}
