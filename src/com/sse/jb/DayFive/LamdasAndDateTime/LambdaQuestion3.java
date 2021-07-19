package com.sse.jb.DayFive.LamdasAndDateTime;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaQuestion3 {
    public static List<String> qThree(List<String> list) {
        return ( list
                .stream()
                .filter(string -> string.startsWith("a") && string.length() ==3)
                .collect(Collectors.toList())
        );
    }
}
