package Assignement;

import java.util.*;

public class Menu {
	static Scanner sc=new Scanner(System.in);
	static Operation operation =new Operation();
	static int choiceCode=0;
	public static void menu() {
		while(true) {
			System.out.println("Enter 1 for adding contact");
			System.out.println("Enter 2 for finding");
			System.out.println("Enter 3 for downloading");
			System.out.println("Enter 4 to exit");
			
			try {
				choiceCode=Integer.parseInt(sc.nextLine().trim());	
			}catch(Exception e) {
				System.out.println("You have entered an invalid datatype please enter again");
				continue;	
			}
			switch(choiceCode) {
				case(1):
					operation.adding();
					break;
				case(2):
					operation.finding();
					break;
				case(3):
					operation.downloading();
					break;
				case(4):
					System.exit(0);
				default:
					System.out.println("Wrong entry please enter from minimum 1 to maximum 4");
			}
		}
	}
}
