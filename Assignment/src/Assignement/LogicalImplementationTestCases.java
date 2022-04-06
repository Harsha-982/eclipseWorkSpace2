package Assignement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class LogicalImplementationTestCases {

	LogicImplementation im=new LogicImplementation();
	HashSet<String> emails=new HashSet<String>();
	HashSet<Long> numbers=new HashSet<Long>();
	String name;
	@Nested
	
	class ForLogicI{
		@Test
		@Tag("AddLogic")
		void RepeatedData() {
			
			emails.add("harsha@gmail.com");
			numbers.add(7013773839l);
			numbers.add(7013773839l);
			name="harsha";
			Object result = im.addLogic(name,numbers,emails);
			ArrayList<Object> expected=new ArrayList<Object>();
			expected.add(7013773839l);
			expected.add("harsha@gmail.com");
			expected.add("harsha");
			Boolean check=expected.equals(result);
			assertTrue(check);	
		}
		@Test
		@Tag("AddLogic")
		void RepeatedName() {
			
			emails.add("subbarao@gmail.com");
			numbers.add(9849865767l);
			
			name="harsha";
			Object result = im.addLogic(name,numbers,emails);
			ArrayList<Object> expected=new ArrayList<Object>();
			expected.add(9849865767l);
			expected.add("subbarao@gmail.com");
			expected.add("harsha");
			Boolean check=expected.equals(result);
			assertTrue(check);	
		}
	
		@Test
		@Tag("AddLogic")
		void DuplicateNumber() {
			
			emails.add("usha@gmail.com");
			numbers.add(7013773839l);
			name="usha";
			Object result = im.addLogic(name,numbers,emails);
			assertEquals("Entered Number is already exist please enter another number",result);
		}
	
		@Test
		@Tag("AddLogic")
		void DuplicateEmail() {
			
			emails.add("harsha@gmail.com");
			numbers.add(9876543210l);
			name="Sravani";
			Object result = im.addLogic(name,numbers,emails);
			assertEquals("Entered email is already exist please enter another email",result);
		}
		@Test
		@Tag("FindLogic")
		void testingforfind(){
			name="harsha";
			List result=im.findLogic("harsha@gmail.com");
			ArrayList<Object> expected=new ArrayList<Object>();
			expected.add(7013773839l);
			expected.add("harsha@gmail.com");
			expected.add("harsha");
			ArrayList<Object> expected1=new ArrayList<Object>();
			expected1.add(expected);
			Boolean check=expected1.toString().equals(result.toString());
			System.out.println(result);
			assertTrue(check);
			
		}
		
	}
}
