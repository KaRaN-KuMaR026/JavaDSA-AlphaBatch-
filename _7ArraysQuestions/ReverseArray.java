package _7ArraysQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
         int[] numbers = {2,4,6,8,10};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }

    private static int[] reverseArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        return numbers;
    }
}
