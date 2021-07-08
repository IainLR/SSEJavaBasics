package com.sse.jb.DayTwo;

public class Rectangle implements Shape{
    private int length;
    private int width;
    private double area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Rectangle(int height, int width) {
        this.length = height;
        this.width = width;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public void display() {
        System.out.println("The length of our rectangle is: " + this.length);
        System.out.println("The width of our rectangle is: " + this.width);
        System.out.println("The area of our rectangle is: " + this.area);
        System.out.println();
    }
}
