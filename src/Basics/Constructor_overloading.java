package Basics;
import java.util.*;

public class Constructor_overloading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius to find area of circle");
		int radius = sc.nextInt();
		System.out.println("Enter length and breath to find area opf rectangle");
		int length =sc.nextInt();
		int breath = sc.nextInt();
		System.out.println("Enter three sides of trianlge to fing area");
		int sideA = sc.nextInt();
		int sideB = sc.nextInt();
		int sideC = sc.nextInt();
		
		Area circle=new Area(radius);
		Area rectangle=new Area(length,breath);
		Area triangle=new Area(sideA, sideB, sideC);
		
		System.out.println("Area of Circle is "+(3.14*circle.radius*circle.radius));
		System.out.println("Area of Rectangle is "+(rectangle.length*rectangle.breath));
		double s =(triangle.sideA+triangle.sideB+triangle.sideC)/2;
		System.out.println("Area of Triangle is "+(Math.sqrt(s*(s-triangle.sideA)*(s-triangle.sideB)*(s-triangle.sideC))));
		
		sc.close();
	}
}

class Area{
	int radius , length , breath , sideA ,sideB,sideC;
	
	Area(int radius){
		this.radius = radius;
	}
	Area(int length, int breath){
		this.length = length;
		this.breath = breath;
	}
	Area(int sideA, int sideB,int sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
}
