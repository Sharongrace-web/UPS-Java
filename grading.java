package scannerpractice;
import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade O");
        } else if (marks >= 80) {
            System.out.println("Grade A+");
        } else if (marks >= 70) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B+");
        } else if (marks >= 50) {
            System.out.println("Grade B");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else if (marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");
        }
        sc.close();
    }
}