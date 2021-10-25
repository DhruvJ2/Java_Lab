package Basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		int basicSalary;
		double finalSalary;
		basicSalary = 20000;
		
		double hra , da ;
		hra = basicSalary * 0.2;
		da = basicSalary * 0.05;
		
		finalSalary = basicSalary + hra + da ;
		System.out.println("Final Salary is "+finalSalary);
	}
}
