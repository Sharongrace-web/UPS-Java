
package scannerpractice;

import java.util.Scanner;

public class keywordcalculator {

    int number;

    keywordcalculator(int number) {
        this.number = number;
    }
    keywordcalculator getObject() {
        return this;
    }
    void display() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        keywordcalculator c = new keywordcalculator(num);

        c.getObject().display();

        sc.close();
    }
}
