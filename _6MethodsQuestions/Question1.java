package _06MethodsQuestions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(averageOfThree(a,b,c));
    }

    private static float averageOfThree(int a, int b, int c) {
        return (float) (a + b + c) /3;
    }
}
