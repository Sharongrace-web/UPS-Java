
package scannerpractice;

class Person {
    String name = "Parent";
}

public class keywordstudent extends Person {
    String name = "Child";

    void display() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + this.name);
    }

    public static void main(String[] args) {
        keywordstudent s = new keywordstudent();
        s.display();
    }
}
