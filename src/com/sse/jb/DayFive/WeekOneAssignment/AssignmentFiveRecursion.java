package com.sse.jb.DayFive.WeekOneAssignment;

public class AssignmentFiveRecursion {

    public static boolean groupSumClump(int start, int[] arr, int sumGoal ) {
//        System.out.println(Arrays.toString(arr));
        if(start >= arr.length)
            return sumGoal == 0;

        int i = start;
        int sum = 0;

        while(i < arr.length && arr[start] == arr[i]) {
            sum += arr[i];
            i++;
        }

        if(groupSumClump(i, arr, sumGoal - sum)) {
            return true;
        }

        return groupSumClump(i, arr, sumGoal);
    }

}

