package Basics;
import java.util.*;

public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for multiplication table");
		int number = sc.nextInt();
		
		for(int i = 1; i<=12; i++) {
			System.out.println(number+"x"+i+" = "+(number*i));
		}
		sc.close();
	}
}
