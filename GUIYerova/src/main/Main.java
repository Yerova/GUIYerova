package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {

		
		UsefulGUI myUsefulGui = new UsefulGUI();
		JFrame frame = myUsefulGui.frameCreator(true);
		JPanel panel = myUsefulGui.panelCreator(255, 255, 255, 0, 0, 1600, 900);
		
		JButton project1 = myUsefulGui.buttonCreator("Project 1", 10, 25, 255, 125, 50, 300, 100);
		JButton project2 = myUsefulGui.buttonCreator("Project 2", 10, 25, 225, 650, 50, 300, 100);
		JButton project3 = myUsefulGui.buttonCreator("Project 3", 10, 25, 225, 1175, 50, 300, 100);
		
		JButton project4 = myUsefulGui.buttonCreator("Project 4", 10, 25, 255, 125, 250, 300, 100);
		JButton project5 = myUsefulGui.buttonCreator("Project 5", 10, 25, 225, 650, 250, 300, 100);
		JButton project6 = myUsefulGui.buttonCreator("Project 6", 10, 25, 225, 1175, 250, 300, 100);
		
		JButton project7 = myUsefulGui.buttonCreator("Project 7", 10, 25, 255, 125, 450, 300, 100);
		JButton project8 = myUsefulGui.buttonCreator("Project 8", 10, 25, 225, 650, 450, 300, 100);
		JButton project9 = myUsefulGui.buttonCreator("Project 9", 10, 25, 225, 1175, 450, 300, 100);
		
		project1.addActionListener(e -> new Container());
		project2.addActionListener(e -> new Panel());
		project3.addActionListener(e -> new Buttoning());
		
		project4.addActionListener(e -> System.out.println("NO PROJECT SET!"));
		project5.addActionListener(e -> System.out.println("NO PROJECT SET!"));
		project6.addActionListener(e -> System.out.println("NO PROJECT SET!"));
		
		project7.addActionListener(e -> System.out.println("NO PROJECT SET!"));
		project8.addActionListener(e -> System.out.println("NO PROJECT SET!"));
		project9.addActionListener(e -> System.out.println("NO PROJECT SET!"));
		
		panel.add(project1);
		panel.add(project2);
		panel.add(project3);
		
		panel.add(project4);
		panel.add(project5);
		panel.add(project6);
		
		panel.add(project7);
		panel.add(project8);
		panel.add(project9);
		
		panel.setLayout(null);
		frame.add(panel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		int i = scanner.nextInt();
//		
//		switch(i) {
//		
//		case 1:
//			Container myFrame = new Container();
//			break;
//			
//		case 2:
//			Panel panel = new Panel();
//			break;
//			
//		case 3:
//			Buttoning buttoning = new Buttoning();
//			break;
//			
//		default:
//			System.out.println("You didn't choose the right thing!");
//			break;
//		}
	}
}
