package com.sse.jb.DayFive.WeekOneAssignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentThreeFunctional {

    public static List<Integer> multiplyByTwo(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();

        for (Integer integer : list) {
            returnList.add(integer * 2);
        }

        System.out.println(returnList);
        return returnList;
    }

}
