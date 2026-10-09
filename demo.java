package scannerpractice;
import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		String age = sc.nextLine();
		System.out.println("Enter your college:");
		String college = sc.nextLine();
		System.out.println("Enter your course:");
		String course = sc.nextLine();
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("College:" + college);
		System.out.println("Course:" + course);
	}
}