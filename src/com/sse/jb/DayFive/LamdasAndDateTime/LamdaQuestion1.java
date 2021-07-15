package com.sse.jb.DayFive.LamdasAndDateTime;

import java.util.Arrays;

public class LamdaQuestion1 {

    public static void lengthDescending( String[] arr) {
        Arrays.sort(arr,
                (String a, String b) -> Integer.signum(b.length() - a.length())
        );
        System.out.println(Arrays.toString(arr));
    }

    public static void lengthAscending(String[] arr) {
        Arrays.sort(arr,
                (String a, String b) -> Integer.signum(a.length() - b.length())
        );
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayAlphabetically(String[] arr) {
        Arrays.sort( arr,
                (String a, String b) -> a.compareTo(b)
        );
        System.out.println(Arrays.toString(arr));
    }

    public static int eCharSort(String a, String b) {
        return  (a.contains("e") ? 0 : 1) - (b.contains("e") ? 0 : 1);

    }


}
