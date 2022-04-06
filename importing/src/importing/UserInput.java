package importing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) 
		throws IOException
		{
		//enter the data
			BufferedReader reader= new BufferedReader(new InputStreamReader (System.in));
			Scanner sc=new Scanner(System.in);
		//read the data using line
			String name =reader.readLine();
			String name1=sc.next();
			String name2=sc.nextLine();
		//print
			System.out.println(name2);
			System.out.println(name);
			System.out.println(name1);
	
			
		}
		
	
}
