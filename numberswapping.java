package scannerpractice;
import java.util.Scanner;
public class numberswapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number A:");
		int a = sc.nextInt();
		System.out.println("Enter your Number B:");
		int b = sc.nextInt();
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("A:"+(a));
		System.out.println("B:"+(b));
	}

}
