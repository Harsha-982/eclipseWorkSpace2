package Abstraction;

public class Abstract {

	public static void main(String[] args) {
		System.out.println("About laptops");
		Laptop lh =new Hp();
		lh.company();
		Laptop ld =new Dell();
		ld.company();
	}
}
