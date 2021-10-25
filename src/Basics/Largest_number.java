package Basics;
import java.util.*;

public class Largest_number {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int array[]=new int[n];
		int largest=0;
		System.out.println("Enter a set of numbers");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		largest = array[0];
		for(int i = 0; i < n; i++) {
				if(array[i]>largest)
					largest = array[i];
		}
		System.out.println("Largest Number int the given array is "+largest);
		
	}
}
