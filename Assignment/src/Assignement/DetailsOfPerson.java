package Assignement;

import java.util.HashSet;
import java.util.List;

public interface DetailsOfPerson {
	public Object addLogic(String name1,HashSet<Long> numbers,HashSet <String> emails/*,HashSet address*/);
	public List findLogic(String nameornumber);
	public void downloadlogic(String name);
}


