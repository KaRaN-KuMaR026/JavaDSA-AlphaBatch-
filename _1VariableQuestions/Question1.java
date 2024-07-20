package _1VariableQuestions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(average(a,b,c));
    }

    public static float average(int a,int b,int c){
        return (float) (a + b + c) /3;
    }
}
