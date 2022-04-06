package Anagram;
import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String str1= sc.nextLine();
		char array[]=str.toCharArray(); // char array representation
		char array1[]=str1.toCharArray();
		Arrays.sort(array);
		Arrays.sort(array1);
		//can convert back to string and print 
		String s=Arrays.toString(array); // converted back to string	
		String s1=Arrays.toString(array1);
		if(s.equals(s1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		// or can print in this way
//		if(Arrays.equals(array1,array)) {
//			System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Not Anagram");
//		}

	}
}
