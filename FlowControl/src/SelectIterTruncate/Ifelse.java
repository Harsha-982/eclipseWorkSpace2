package SelectIterTruncate;

public class Ifelse {

	public static void main(String[] args) {
		// if(boolean)==> accepts only boolean
		if(10>3) 
			System.out.println("10");

		else
			System.out.println("3");
		//accepts comparison operator but not assignment operator in integer
		int x=10;
		if(x!=10) System.out.println("10");
		else System.out.println(x++); // 10 ==>after printing then gets incremented
		
		
		boolean bool=false;
		//EXAMPLE :1
		if(bool) {System.out.println(bool);} //no output because bool= false so can't enter loop
		//EXAMOLE 2:
		if(!bool) {System.out.println(bool);}// false because the condition is true
		//EXAMPLE 3:
		if(bool==false) {System.out.println(bool);} // false(because comparision is true)
		if(true);
		
		if(true) {int x1=10;}
		
		//"FOR EVERY FLOW CONTRROLS DECLARATIVE STATEMENTS ARE NOT ALLOWED IF NOT ENCLOSED WITH BRACES"
	}
}
class IfelseDangle{
	public static void main(String[] args) {
		
		if(true) 
			System.out.println("hi welcome");
		if(false)
			System.out.println("people");
		else
			System.out.println("to ladies and gentlemen"); // every else is mapped tonearest if 
		// so no "DANGLING PROBLEM"
	}
}




class SwitchStatement{
	public static void main(String[] args) {
		// acceptable expressions are int ,char, byte,short
		// {} mandatory, case and default are optional...
		int int1=10;
		int int2=20;
		final int finalint=12;
		final int finalint2=10;
		switch(int1) {
		case 10:
			System.out.println("10");
			break;
		case 11:
			System.out.println("11");
			break;
//		case int2: every case label shout be constant not variable
//			break
		case finalint: // this valid"BECAUSE THIS VARIABLE IN FINAL VARIABLE"
			System.out.println("12");
			break;
//		case  finalint2: value of "finalint2" and int1 is 
//			"DUPLICATES VALUES ARE NOT ALLOWED"
		case 10+20: // expression is constant so valid 
			System.out.println("10+20");
		default:
			System.out.println("default");
			break;
		}
	}
}

