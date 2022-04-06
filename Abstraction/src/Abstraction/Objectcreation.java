package Abstraction;

abstract class Objectcreation {

	int i;
	int j;
	Objectcreation(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println(this.hashCode()); // if both hash codes are same then there is only child class object go created
	}
	abstract void run();
	
}
class Number extends Objectcreation{
	Number(int i,int j){
		super(i,j);
		System.out.println(this.hashCode());     // hashcode is for knowing about object creation for every object hashcode is different
		System.out.println(i+j);			
	}
	public void run() {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		Number num = new Number(10,20);    // directly invokes current class constructor
		num.run();
	}
}

