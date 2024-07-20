package _3ConditionalQuestions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayNumber = in.nextInt();
        System.out.println(dayName(dayNumber));
    }

    private static String dayName(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
        }
        return "Wrong Input!\nEnter day number between 1 and 7";
    }
}
