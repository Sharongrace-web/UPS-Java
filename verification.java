package scannerpractice;
import java.util.Scanner;

public class verification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String requsername = "admin";
		String reqpassword = "admin123";
		System.out.println("Enter Username:");
		String username = sc.nextLine();
		System.out.println("Enter Password:");
		String password = sc.nextLine();
		
		if(username .equals (requsername) && password .equals (reqpassword)) {
			System.out.println("Logged in");
		} else {
			System.out.println("Invalid Username or Password");
		}
	}

}
