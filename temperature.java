package scannerpractice;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius:");
		float a = sc.nextFloat();
		System.out.println("Kelvin:"+(a+273.15));
	}

}
