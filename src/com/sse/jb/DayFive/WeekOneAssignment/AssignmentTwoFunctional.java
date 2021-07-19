package com.sse.jb.DayFive.WeekOneAssignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwoFunctional {

    public static List<Integer> rightmostDigits(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();

        for (Integer integer : list) {
            returnList.add(integer % 10);
        }

        System.out.println(returnList);
        return returnList;
    }

}
