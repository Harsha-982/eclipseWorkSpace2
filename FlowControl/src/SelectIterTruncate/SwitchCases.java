package SelectIterTruncate;

import java.util.Scanner;

public class SwitchCases {
	public void defaultcase(int switchvar) {
		switch(switchvar) {								 // input 0: output :0
			default:                                     // input 1: output :1
				System.out.println("default");			 //	input 2: output :2,0
			case 1:										 // input 3: output :default,1
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
			case 0:
				System.out.println("0");
		}
	}
	public void flowThrow(int switchvar1) {
		switch(switchvar1) {
			case 1:											// for all three cases one statement gets executed.
			case 2:
			case 3:
				System.out.println("time not out");			// any case statement gets executed until it encounter any braces or break
				break;
			default:
				System.out.println("time out");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		SwitchCases sc=new SwitchCases();
		int switchvar=scan.nextInt();
		int switchvar1=scan.nextInt();
		sc.defaultcase(switchvar);
		sc.flowThrow(switchvar1);
		
		
	}
}
