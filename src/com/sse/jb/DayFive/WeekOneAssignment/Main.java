package com.sse.jb.DayFive.WeekOneAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(54);
        myList.add(52);
        myList.add(-8);

        AssignmentTwoFunctional.rightmostDigits(myList);
        AssignmentThreeFunctional.multiplyByTwo(myList);

        List<String> xStrings = Arrays.asList("ax", "bxb", "cx");

        AssignmentFourFunctional.removeX(xStrings);

        AssignmentFiveRecursion.groupSumClump(0, new int[]{2, 4, 8}, 10);
        AssignmentFiveRecursion.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14);
        AssignmentFiveRecursion.groupSumClump(0, new int[]{2, 4, 4, 8}, 14);


    }
}
