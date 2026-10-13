package scannerpractice;
import java.util.Scanner;
public class upsidedownrighttriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			for (int j=10;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}