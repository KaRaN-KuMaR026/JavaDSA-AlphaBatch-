package _06MethodsQuestions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        return num == reverse;
    }

    private static int reverse(int num) {
        int reverse = 0;
        while(num > 0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        return reverse;
    }
}
