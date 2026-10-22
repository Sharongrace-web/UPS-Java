
package scannerpractice;

import java.util.Scanner;

public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student s = new Student(name);
        s.display();

        sc.close();
    }
}
