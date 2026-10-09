package scannerpractice;

import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A:");
		int a = sc.nextInt();
		System.out.println("B:");
		int b = sc.nextInt();
		System.out.println("Add:"+(a+b));
		System.out.println("Sub:"+(a-b));
		System.out.println("Mul:"+(a*b));
		System.out.println("Div:"+(a/b));
	}

}
