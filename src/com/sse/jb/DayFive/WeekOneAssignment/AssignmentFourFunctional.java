package com.sse.jb.DayFive.WeekOneAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentFourFunctional {

    public static List<String> removeX(List<String> list) {
        List<String> returnList = new ArrayList<>(Collections.emptyList());

        for (String string : list) {
            String modString = string.replaceAll("[Xx]","");
            returnList.add(modString);
        }

        System.out.println(returnList);
        return returnList;
    }

}
