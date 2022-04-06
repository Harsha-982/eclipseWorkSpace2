package Constructor2;

class Constructor {
	String name;
	int marks;
	Constructor(int marks) 
	{
	// void Constructor then it is a method
		this("meghan");	
		this.marks=marks;
	}
	Constructor(String name) {
		this(name,70);
	}
	Constructor(String name, int marks) {
		this.name=name;
		System.out.println(marks);
	}
	void add(Constructor c,int s) {  
		System.out.println(s+"happy......!");
	}
	void display() {
		System.out.println("Student name:" +name);
		System.out.println("Student marks:" +marks);
		add(this,4);
	}

	public static void main(String[] args) {
		Constructor can = new Constructor(20);
		can.display();
	
		
	}
}
