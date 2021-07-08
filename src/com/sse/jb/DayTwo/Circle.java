package com.sse.jb.DayTwo;

public class Circle implements Shape{

    private int radius;
    private double area;
    private double circumference;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public Circle(int radius) {
        this.radius = radius;
        this.area = calculateArea();
        this.circumference = Math.PI * (2 * this.radius);
    }


    @Override
    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public void display() {
        System.out.println("radius of Circle= " + this.radius);
        System.out.println("area of Circle = " + this.area);
        System.out.println("Circumference of Circle = " + this.circumference);
        System.out.println();
    }
}
