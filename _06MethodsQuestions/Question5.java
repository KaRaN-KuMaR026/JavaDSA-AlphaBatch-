package _06MethodsQuestions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(binCoeff(6,2));
    }

    private static int binCoeff(int n, int r) {
        return fact(n)/(fact(r) * fact(n -r));
    }

    private static int fact(int n) {
        int fact = n;
        if(n == 0 || n == 1)
            return 1;
        else
            fact = fact * fact(n - 1);
        return fact;
    }
}
