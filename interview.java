package scannerpractice;
import java.util.Scanner;

public class interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.println("Are you selected in round " + i + "? (yes/no)");
            String result = sc.next();
            if (result.equalsIgnoreCase("no")) {
                System.out.println("Rejected");
                return;
            }
        }
        System.out.println("Selected");
        sc.close();
    }
}