package scannerpractice;
import java.util.Scanner;
public class divisibleby3 {
	public static void main(String[] args) {
		System.out.println("Numbers divisible by 3");
		for (int i=1;i<=100;i++) {
			if (i%3==0) {
			System.out.println(i + " ");
			}
		}
	}
}

