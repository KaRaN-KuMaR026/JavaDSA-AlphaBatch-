package _06MethodsQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }

    public static boolean isEven(int a){
        return a%2 == 0;
    }
}
