package week1.assignment;

public class IsPrime {
	

	public static void main(String[] args) {
	
		int num = 10;
		int count = 0;
		for(int i = 1; i < num; i++) {
			
			if(num % 2 == 0) {
				count++;
			}	
		}
		if(count == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("NotPrime");
		}
	}

}
