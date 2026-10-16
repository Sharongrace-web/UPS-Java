package scannerpractice;

public class largestelement{
    public static void main(String[] args){
        int[] numbers = {10, 34, 245, 190, 1980, 57};
        int max = numbers[0]; 
        for (int i=1; i < numbers.length; i++){
            if (numbers[i]>max) {
                max=numbers[i]; 
            }
        }
        System.out.println("The largest element is: " +max);
    }
}
