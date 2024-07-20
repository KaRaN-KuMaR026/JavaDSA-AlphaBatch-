package _3ConditionalQuestions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(checkOddEven(num));
    }

    private static String checkOddEven(int num) {
        if(num%2 == 0)
            return "The number is Even";
        else
            return "The number is Odd";
    }
}
