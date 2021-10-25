package Basics;
import java.util.*;

public class Matrix {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of matrix A");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		
		System.out.println("Enter size of matrix B");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int b[][]=new int[p][q];
		
		System.out.println("Enter values in Matrix A");
		for(int rows = 0; rows<m; rows++) 
			for(int col = 0; col<n; col++)
				a[rows][col]=sc.nextInt();
		
		System.out.println("Enter values in Matrix B");
		for(int rows = 0; rows<p; rows++) 
			for(int col = 0; col<q; col++)
				b[rows][col]=sc.nextInt();
		
		System.out.println("Enter an option");
		System.out.println("a) Add two matrices");
		System.out.println("b) multiply two matrices");
		System.out.println("c) transpose of matrix A");
		System.out.println("d) Addition of diagonal and non-diagonal elements");
		char ch=sc.next().charAt(0);
		
		sc.close();
		
		int rows = (m>p)?m:p;
		int col = (n>q)?n:q;
		int temp[][]=new int[rows][col];
		
		switch(ch) {
		//add
		case 'a':
			
			for(int i = 0; i<rows; i++) 
				for(int j = 0; j<col; j++)
					temp[i][j]= a[i][j] + b[i][j];
					
			for(int i = 0; i<rows; i++) { 
				for(int j = 0; j<col; j++) {
					System.out.print(temp[i][j]+" ");
				}
				System.out.println();
			}
			break;
		//multiply
		case 'b':
			if(n == p) {
				int sum;
				for(int i = 0; i<m; i++) {
					for(int j = 0; j<q; j++) {
						sum=0;
						for(int k=0; k<p; k++)
							sum += a[i][k]*b[k][j];
						temp[i][j]=sum;
					}	
				}
				for(int i = 0; i<rows; i++) { 
					for(int j = 0; j<col; j++) {
						System.out.print(temp[i][j]+" ");
					}
					System.out.println();
				}
			}
			else
				System.out.println("Cannot multiply");
			
			break;
		//transpose
		case 'c':
			
			for(int i = 0; i<rows; i++) 
				for(int j = 0; j<col; j++)
					temp[i][j] = a[j][i];
					
			for(int i = 0; i<rows; i++) { 
				for(int j = 0; j<col; j++) {
					System.out.print(temp[i][j]+" ");
				}
				System.out.println();
			}
			break;
			
		case 'd':
			
			int sumdiagonal;
			int nondiagonal;
			sumdiagonal=nondiagonal=0;
			
			for(int i = 0; i<rows; i++) 
				for(int j = 0; j<col; j++)
					if(i==j)
						sumdiagonal+=a[i][j];
					else
						nondiagonal+=a[i][j];
			System.out.println("Sum of diagonal elements is " + sumdiagonal);
			System.out.println("Sum of non-diagonal elements is " + nondiagonal);
				
			break;
		default:
			System.out.println("Wrong option");	
		}
	}
}
