package scannerpractice;
import java.util.Scanner;
public class upsidedownlefttriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for (int k=10;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
