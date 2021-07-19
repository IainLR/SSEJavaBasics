package com.sse.jb.DayFive.LamdasAndDateTime;


public class LambdaQuestion2 {

    public static void qTwoEAndO(Integer[] arr) {
        StringBuilder commaSeparatedResult = new StringBuilder();

        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                commaSeparatedResult.append("e").append(integer).append(", ");
            } else {
                commaSeparatedResult.append("o").append(integer).append(", ");
            }
        }
        System.out.println(commaSeparatedResult);

    }

}

