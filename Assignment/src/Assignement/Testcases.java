package Assignement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testcases {

	
	@Test
	@DisplayName("Numbercheck for invalid number")
	void test(){
		Checker ch=new Checker();
		Long number=ch.validatenumber(123456780l);
		assertFalse(number==123456780l);
	}
	@Test
	@DisplayName("Numbercheck for valid number ")
	void test1(){
		Checker ch=new Checker();
		Long number =ch.validatenumber(9876543210l);
		assertEquals(10, number.toString().length());
	}
	@Test
	@DisplayName("Emailcheck for valid mail")
	void test3() {
		Checker ch=new Checker();
		String email =ch.validateemailid("h@gmail.com");
		assertTrue(email.equals("h@gmail.com"));
	}
	@Test
	void test4() {
		Operation op=new Operation();
		
	}

}
