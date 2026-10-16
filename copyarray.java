package scannerpractice;

import java.util.Arrays;
import java.util.Scanner;

public class copyarray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++){
            originalArray[i] = scanner.nextInt();
        }
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("\nElements in the copied array:");
        for (int element : copiedArray){
            System.out.print(element + " ");
        }
    }
}
