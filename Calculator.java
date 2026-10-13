package scannerpractice;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double a = sc.nextDouble();
		System.out.println("Enter an operator:");
		char op = sc.next().charAt(0);
		System.out.println("Enter the second number:");
		double b = sc.nextDouble();
		double result = 0;
		boolean Op = true;
		if (op=='+') {
			result = a+b;
		} else if (op=='-') {
			result = a-b;
		} else if (op=='*') {
			result = a*b;
		}else if (op=='/') {
			result = a/b;
		} else {
			System.out.println("Enter a valid operator");
			Op = false;
		}
		if (Op) {
			System.out.println("Result: "+a+" "+op+" "+b+"="+result);
		}
	}
}