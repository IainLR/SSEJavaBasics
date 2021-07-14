package com.sse.jb.DayFour;

public class DayFourAssignment1Singleton {

    volatile private static DayFourAssignment1Singleton singleton = null;

    private DayFourAssignment1Singleton() {

    }

    public DayFourAssignment1Singleton getSingleton() {
        // check 1
        if (singleton == null) {
            // lock
            synchronized (singleton) {
                //check 2
                if (singleton == null) {
                    singleton = new DayFourAssignment1Singleton();
                }
            }
        }

        return singleton;
    }
}
