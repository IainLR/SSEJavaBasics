package com.sse.jb.DayTwo;

public class DayTwoAssignment1 {

    public static void addingFromTheCommandLine(String[] args) {
        int sum = 0;
        StringBuilder nonNumbers = new StringBuilder();

        for (String a : args) {
            try {
                sum += Integer.parseInt(a);
            } catch (Exception ignored) {
                nonNumbers.append(a).append(" ");
            }
        }

        System.out.println("Your Sum is: " + sum);
        System.out.println("your args which were not numbers: " + nonNumbers);
        System.out.println();
    }

}
