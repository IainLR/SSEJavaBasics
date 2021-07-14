package com.sse.jb.DayFour;

public class DayFourAssignment1 {

    volatile private static DayFourAssignment1 singleton = null;

    private DayFourAssignment1() {

    }

    public DayFourAssignment1 getSingleton() {
        // check 1
        if (singleton == null) {
            // lock
            synchronized (singleton) {
                //check 2
                if (singleton == null) {
                    singleton = new DayFourAssignment1();
                }
            }
        }

        return singleton;
    }
}
