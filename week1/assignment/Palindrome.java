package week1.assignment;

public class Palindrome {
	
	public static  void main (String[]args) {
		
		
		int num =1234;
		
		int temp=num;
		
		int rev=0;
		
		int rem;
		
		while(temp != 0) {
			
			rem = temp%10;
			
			rev = (rev*10)+rem;
			
			temp = temp/10;
			
		}
		if(temp == rev) {
			
			System.out.println(num + " is Palindrome num");
		}
		else {
			
			System.out.println(num + " is not Palindrme num");
		}
		
		
		
	}

}
