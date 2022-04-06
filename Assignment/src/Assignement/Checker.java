package Assignement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Checker {
	Scanner sc=new Scanner(System.in);
	public String validatename(String name) {
		while(true) {
			if(!name.matches("[a-zA-Z]+")) {
				System.out.println("You have entered invalid name please enter again");
				name=sc.nextLine();
			}
			else {
				break;
			}
		}return name;
	}

	public Long validatenumber(Long number) {
		while(true){
			if(!(number.toString().length()==10)) {
				System.out.println("You have entered an invalid number please enter valid number");
				number=sc.nextLong();
			}
			else {
				break;
			}
		}
		return number;
	}

	public String validateemailid(String emailid) {
		while(true) {
			if(!emailid.endsWith("@gmail.com") /*| !(emailid.length()>10*/) {
				System.out.println("You have entered an invalid emailid please enter valid emailid");
				emailid=sc.nextLine();
			}
			else {
				break;
			}
		}
		return emailid;
	}

	public String validateAddress(String address,String fieldname) {
		while(true) {
			if(!(address.length()>0)) {
				System.out.println("You haven't entered this fill Please enter data");
				address=sc.nextLine();
			}
			else {
				break;
			}
		}
		return address;
	}
	public Integer validatepincode(Integer pincode) {
		while(true) {
			if(!(pincode.toString().length()==6)) {
				System.out.println("Enter a valid pincode");
				pincode=Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		return pincode;
	}
}
