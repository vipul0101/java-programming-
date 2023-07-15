package com.company;
/*
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    //problem 1
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    //problem 2
    public double surfaceArea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height;
    }
    public double volume(){
        return 3.142*radius*radius*height;
    }
}*/

class Rectangle{
    private final int length;
    private final int breadth;
    /*public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }*/
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

class sphere{
    private final int Radius;

    public int getradius() {
        return Radius;
    }
    public sphere(int Radius) {
        this.Radius = Radius;
    }

    public double SurfaceArea(){
        return 4*3.142*Radius*Radius;
    }
    public double Volume(){
        return (double)(4/3)*3.142*Radius*Radius*Radius;
    }
}
public class CWH_44_PS9 {
    public static void main(String[] args) {

       /* cylinder cy = new cylinder(9,12);
        //problem1 + //problem3 both included
       // cy.setHeight(12);
        System.out.println(cy.getHeight());
       // cy.setRadius(9);
        System.out.println(cy.getRadius());

        //problem2

        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());
*/
        //problem 4
        Rectangle rec = new Rectangle(5, 6);
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());

        //problem 5
        sphere sp = new sphere(6);
        System.out.println(sp.getradius());
        System.out.println(sp.SurfaceArea());
        System.out.println(sp.Volume());
    }
}
