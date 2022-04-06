package Assignement;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;


public class LogicImplementation implements DetailsOfPerson{
	Scanner sc=new Scanner(System.in);
	
	static HashMap<String,ArrayList> details=new HashMap<String,ArrayList>();
	static CopyOnWriteArrayList<Object> allnumbersemails =new CopyOnWriteArrayList<Object>();
	ArrayList emptylist;
	
	
	public Object addLogic(String name1,HashSet<Long> numbers,HashSet <String> emails/*,HashSet address*/){
		ArrayList<Object> filterednumbersemails=new ArrayList<Object>();

		Integer atleastonenumber=(int)numbers.stream().filter(a->allnumbersemails.addIfAbsent(a))
				.map(b->filterednumbersemails.add(b)).count();
		
		Integer atleastoneemail=(int)emails.stream().filter(a->allnumbersemails.addIfAbsent(a))
				.map(b->filterednumbersemails.add(b)).count();
		
		if(atleastoneemail>0 & atleastonenumber>0) {
			filterednumbersemails.add(name1);
//			filterednumbersemails.addAll(address);
			emptylist=new ArrayList<Object>();
			if(details.containsKey(name1)) {
				details.get(name1).add(filterednumbersemails);
			}
			else {
				details.put(name1,emptylist);
				details.get(name1).add(filterednumbersemails);
			}
		}
		else if(atleastoneemail==0 & atleastonenumber==0 ) {
			return ("Entered Number and email are already exist please enter another number and email");

		}
		else {
			allnumbersemails.remove(allnumbersemails.size()-1);
			String error=(atleastoneemail==0)?"Entered email is already exist please enter another email":
				"Entered Number is already exist please enter another number"; 
//			System.out.println(error);
			return(error);
		}
//		System.out.println(details);
		return filterednumbersemails;
	}
	public List findLogic(String nameornumber) {
		List s1=new ArrayList();
		for (Map.Entry<String,ArrayList> entry: details.entrySet())
		{
			
			s1=(List) entry.getValue().stream()
			.map(Object::toString).filter(check->((String) check).contains(nameornumber)).collect(Collectors.toList());
			
		}
		return s1;
		
	}
	public void downloadlogic(String name) {
		try {
		Properties prop=new Properties();
		FileOutputStream fos=new FileOutputStream("details");
		for (Map.Entry<String,ArrayList> entry: details.entrySet())
		{
			@SuppressWarnings("unchecked")
			List<Object> s1=(List<Object>) entry.getValue().stream()
			.map(Object::toString).filter(check->((String) check).contains(name))
			.collect(Collectors.toList());
				prop.setProperty(name,s1.toString());
				prop.store(fos,"updated");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
