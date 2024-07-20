package _1VariableQuestions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        System.out.println("Bill : " + billWithoutTax(a,b,c));
        System.out.println("Bill After GST : " + billWithTax(a,b,c));
    }

    private static float billWithoutTax(float a, float b, float c) {
        return a + b + c;
    }

    private static float billWithTax(float a, float b, float c) {
        float total = (a + b + c);
        return  (total * 0.18f) + total;
    }
}
