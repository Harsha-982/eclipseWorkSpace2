package SelectIterTruncate;

public class WhileForloop {
	public static void whileloop(int int1) {
//		while(true) invalid
//		while(false) invalid
		int integer1=10;
		int integer2=20;
		while(integer1>integer2) {
			System.out.println("true");
		}
		System.out.println("false");// gets executed at least once
		do {
			System.out.println(int1);
			int1++;					// gets executed at least once
		}while(int1<5);
	}
	static void forloop(int num) {
		int i=0;
		for(i = 0;i<num;i++) {  // for(int i;i<n;i++) invalid            // for(intial;condition;declaration)
			// for(int i,j=0;i<n;i++) because i is not intialized) 		// all parts are optional; intial parts exceutes only once 
			// can't assign different types of variables
			System.out.println(i);
		}
		i=0;
		// PROOF THAT IT IS EXECUTED ONLY ONCE
		for(System.out.println("We reached chennai");i<num;i++) {
			System.out.println("wakeup" );
		} 
		
	}
	static void enhanced() {
		int arr[][] = {{1,2,3},{4,5}};
//		for(int iter=0;iter<arr.length;iter++) {
//			for(int iter1=0;iter1<arr.length;iter1++) {
//				System.out.println(arr[iter][iter1]);
//			}
//		}
		for(int[] iter:arr) {
			for(int iter1:iter) {
				System.out.println(iter1);
			}
		}
	}
	public static void main(String[] args) {
		WhileForloop.whileloop(3);
		WhileForloop.whileloop(5);
		WhileForloop.forloop(4);
		WhileForloop.enhanced();
	}
}

