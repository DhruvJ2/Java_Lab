package Basics;
import java.util.*;

public class Duplicate_Elements {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int array[]=new int[n];
		
		System.out.println("Enter a set of numbers");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		if(n == 0 || n == 1) {
			for(int i = 0; i<n; i++)
				System.out.print("{"+array[i]+"}");
		}
		else {
			int temp[]=new int[n];
			int j = 0;
			
			for(int i = 0; i<n-1; i++) 
				if(array[i] != array[i+1])
					temp[j++] = array[i];
			
			temp[j]=array[n-1];
			
			System.out.print("{");
			for(int i = 0; i <= j; i++)
				System.out.print(temp[i]+",");
			System.out.print("}");
		}
	}
}
