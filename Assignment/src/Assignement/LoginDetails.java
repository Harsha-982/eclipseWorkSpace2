package Assignement;
import java.util.*;
public class LoginDetails{
	public static void main(String[] args) {
		String username,password;
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Enter Username");
		username=userInput.nextLine();
		System.out.println("Enter Password");
		password =userInput.nextLine();
		if(username.equals("h") & password.equals("ht")) {
			Menu m=new Menu();
			m.menu();
		}
	}
}
