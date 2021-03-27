package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		switch(i) {
		
		case 1:
			Container myFrame = new Container();
			break;
			
		case 2:
			Panel panel = new Panel();
			break;
			
		case 3:
			Buttoning buttoning = new Buttoning();
			break;
			
		default:
			System.out.println("You didn't choose the right thing!");
			break;
		}
	}
}
