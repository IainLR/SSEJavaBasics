package com.sse.jb.DayFive.WeekOneAssignment;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AssignmentSixSingleton {

    private static Connection conn = null;

    volatile private static AssignmentSixSingleton instance = null;

    private AssignmentSixSingleton() {

    }

    public static AssignmentSixSingleton getInstance() {
        // check 1
        if (instance == null) {
            // lock
            synchronized (instance) {
                //check 2
                if (instance == null) {
                    instance = new AssignmentSixSingleton();
                }
            }
        }

        return instance;
    }
}
