package SelectIterTruncate;

public class BreakContinue {
	public static void main(String[] args) {
		l1:{
			System.out.println("start program");
			for(int iter=0;iter<5;iter++) {
				if(iter>1) {
					System.out.println(iter);
					break l1; 							//skips label l1 loop prints 2
				}
				}
			}
		System.out.println("out side label");
		l2:{
			for(int iter=0;iter<5;iter++) {
				if(iter>1) {
					System.out.println(iter);
					continue;						// skips an iteration prints 2,3,4
//					System.out.println("don't terminate"); this cant be reachable
				}
			}
		}
		//two ways to write program for odd numbers..
		for(int iter=0;iter<10;iter+=2) {
//			if(iter%2==0) 
//				continue;
//			else 
//				System.out.println(iter);
			System.out.println(iter);
		}
	
	}
}
