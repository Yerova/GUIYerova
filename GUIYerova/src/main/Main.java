package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		if(i == 1)  {
			Container myFrame = new Container();
		} else if(i == 2) {
			Panel panel = new Panel();
		} else System.out.println("Not Possible");
		
	}
}
