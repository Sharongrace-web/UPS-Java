package scannerpractice;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int l = sc.nextInt();
		System.out.println("Enter breadth:");
		int b = sc.nextInt();
		System.out.println("Area:"+(l*b));
	}

}
