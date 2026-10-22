
package scannerpractice;

import java.util.Scanner;

public class Mobile {
    String brand;
    int price;
    Mobile() {
        this("Samsung", 15000);
    }
    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile m = new Mobile();
        m.display();

        sc.close();
    }
}
