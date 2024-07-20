package _1VariableQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(square(a));
    }

    private static int square(int a) {
        return a*a;
    }
}
