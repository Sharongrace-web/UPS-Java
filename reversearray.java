package scannerpractice;
import java.util.Scanner;
import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
