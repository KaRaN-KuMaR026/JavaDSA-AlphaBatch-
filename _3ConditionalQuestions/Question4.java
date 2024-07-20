package _3ConditionalQuestions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = (checkLeap(year) ? "Leap Year!" : "Not a Leap year!");
        System.out.println(result);
    }

    private static boolean checkLeap(int year) {
        if (year % 4 == 0){
            if(year%100 == 0){
                if(year%400 == 0)
                    return true;
                else
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}
