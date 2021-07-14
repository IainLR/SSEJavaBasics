package com.sse.jb.DayFour;

import static org.junit.Assert.*;

public class LineTest {

    Line line = new Line(3.0, 2.0, 8.0, 5.0);
    Line line2 = new Line(6.0, 4.0, 16.0, 10.0);

    @org.junit.Test
    public void getSlope() {
        assertEquals(0.6, line.getSlope(), .0001);
        assertNotEquals(.5, line.getSlope(), .0001);
    }

    @org.junit.Test
    public void getDistance() {
        assertEquals(5.830952, line.getDistance(), .0001);
        assertNotEquals(5.0, line.getDistance(), .0001);
    }

    @org.junit.Test
    public void parallelTo() {
        assertTrue(line.parallelTo(line2));
    }
}