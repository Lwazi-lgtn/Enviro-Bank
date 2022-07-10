package com.eviro.assessment.grad001.LwaziTomson;

import java.util.Scanner;

public class MainClass {
	Controller controller = new Controller();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for savings account \n "
				+"Or 2 for Current Account:");
		
		int option = sc.nextInt();
		if (option != 1 || option != 2) {
			System.out.println("Invalid option");
			sc.close();

		}else if(option == 1){
			
			
		}
	}

}
