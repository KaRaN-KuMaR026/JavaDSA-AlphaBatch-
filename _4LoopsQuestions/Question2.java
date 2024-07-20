package _4LoopsQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if(num == 0 || num == 1)
            return 1;
        else{
            return num * factorial(num -1 );
        }
    }
}
