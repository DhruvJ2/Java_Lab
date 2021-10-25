package Basics;
import java.util.*;

public class Reverse_a_number {
	public static void main(String[] args) {
		
		int rem ,rev;
		rem = rev = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two or more digit number");
		int number = sc.nextInt();
		int temp=number;
		
		while(number!=0) {
			rem = number%10;
			rev= rev*10+ rem;
			number/=10;
		}
		
		System.out.println("Original number = "+temp);
		System.out.println("Reversed number = "+rev);
		
		sc.close();
	}
	
}
