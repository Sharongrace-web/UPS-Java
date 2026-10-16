package scannerpractice;

public class smallestelement {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 1, 67, 120, 3, 20};
        int min = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest element is: " + min);
    }
}
