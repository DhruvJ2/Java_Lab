package Basics;

public class RootOfQuadraticEquation {
	public static void main(String[] args) {
		
		double alpha , beta;
		int a , b , c;
		a = 1 ;
		b = 5 ;
		c = 2 ;
		double equation = b*b -4.0*a*c ;
		
		if(equation >= 0.0) {
		alpha = (-b + Math.pow(equation, 0.5))/(2.0*a);
		beta = (-b - Math.pow(equation, 0.5))/(2.0*a);
		
		System.out.println("Roots of equations are : ");
		System.out.println("Alpha = "+alpha);
		System.out.println("Beta = "+beta);
		}
		
		else {
			System.out.println("Roots are not real");
		}
	}
}
