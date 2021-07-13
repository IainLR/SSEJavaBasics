package com.sse.jb.DayTwo;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Assignment 1:
        DayTwoAssignment1.addingFromTheCommandLine(args);

        // Assignment 2:
        int[][] myMatrix = { { 0, 4, 2, 12 },
                { 25, 5, 23, 1 },
                { 4, 8, 1, 99 },
                { 7, 0, 3, 11 } };
       DayTwoAssignment2.maxNumberAndPositionInMatrix(myMatrix);
        System.out.println();

        // Assignment 3:
        Circle myCircle = new Circle(4);
        myCircle.display();

        Triangle myTriangle = new Triangle(4, 7);
        myTriangle.display();

        Rectangle myRectangle = new Rectangle(6,6);
        myRectangle.display();
    }





}
