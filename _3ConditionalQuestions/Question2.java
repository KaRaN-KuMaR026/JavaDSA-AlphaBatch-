package _3ConditionalQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float fever = in.nextFloat();
        System.out.println(checkFever(fever));
    }

    private static String checkFever(float fever) {
        if(fever > 100)
            return "You have fever";
        return "You do not have Fever";
    }
}
