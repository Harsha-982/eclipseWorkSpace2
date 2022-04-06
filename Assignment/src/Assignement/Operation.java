package Assignement;

import java.util.*;

public class Operation {
	Scanner sc=new Scanner(System.in);
	
//	-------classes that are needed here-------
	Checker check=new Checker();
	LogicImplementation logic =new LogicImplementation();
	
//	---------sets to store data---------	
	
	HashSet<Long> numbers=new HashSet<Long>();
	HashSet<String> emails=new HashSet<String>();
	HashSet<Object> address = new HashSet<Object>();
	
	
	public void adding() {
		String name;
		System.out.println("Enter name");
		name=sc.nextLine();
		
//		-------validating name----------
		
		String name1=check.validatename(name);
		int i=1,j=1,k=1;
		String checking="";
		
//	---------repeats loop until all numbers of user gets added--------
		
		while(checking.equalsIgnoreCase("exit")==false){
			System.out.println("Enter "+i+" number");
			Long number=Long.parseLong(sc.nextLine().trim());
			Long number1=check.validatenumber(number);
			System.out.println("Press enter to add one more number or type \"exit\"");
			checking=sc.nextLine();
			numbers.add(number1);
			i=i+1;
		}
		String emailchecks="";
		
//		---------repeats loop until all emails of user gets added--------
		
		while(emailchecks.equalsIgnoreCase("exit")==false){
			System.out.println("Enter "+j+" email");
			String emailid=sc.nextLine();
			String emailid1=check.validateemailid(emailid);
			System.out.println("Press enter to add one more Mail or type \"exit\"");
			emailchecks=sc.nextLine();
			emails.add(emailid1);
			j=j+1;
		}
//		String addresschecks="";
		
//		---------repeats loop until all addresses of user gets added--------
		
//		while(addresschecks.equalsIgnoreCase("exit")==false) {
//			System.out.println("Enter "+k+" address");
//			System.out.println("Enter door number");		
//			String doornumber=sc.nextLine();
//			
//			-------validating doornumber--------
//			address.add(check.validateAddress(doornumber,"doornumber"));			
//			System.out.println("Enter name of the Street");
//			String Street =sc.nextLine();
//			
//			-------validating street name--------
//			address.add(check.validateAddress(Street,"Street"));
//			System.out.println("Enter name of the village");
//			String village =sc.nextLine();
//			
//			-------validating village name--------
//			address.add(check.validateAddress(village,"village"));
//			System.out.println("Enter name of the State");
//			String state=sc.nextLine();
//			
//			-------validating state name--------
//			address.add(check.validateAddress(state,"State"));
//			System.out.println("Enter pincode");
//			Integer pincode=Integer.parseInt(sc.nextLine().trim());
//			
//			-------validating pincode--------
//			address.add(check.validatepincode(pincode));
//
//			System.out.println("Press enter to add one more adress or type \"exit\"");
//			addresschecks=sc.nextLine();
//			k=k+1;
//		}
		
		logic.addLogic(name1,numbers,emails/*,address*/);
	}
	public HashSet<Long> getallNumbers(){
		return numbers;	
	}
	public void finding() {
		System.out.println("Enter the name or number that you are searching for...");
		String nameornumber=sc.next();
		logic.findLogic(nameornumber);
	}
	public void downloading() {
		System.out.println("Enter the name of person you want to download");
		String name=sc.nextLine();
		logic.downloadlogic(name);
	}
}
