package com.company;


import java.sql.SQLOutput;
                                                                            //problem1
class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

                                                                            //problem2
class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void call() {
        System.out.println("Calling....");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
}

                                                                            //problem3
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
                                                                            }


public class CWH_39_Chapter_8_practiceset {
    public static void main(String[] args) {
                                                                            //problem1
        Employee harry = new Employee();
        harry.salary = 55000;
        harry.name = "Pihu kumari";

        System.out.println(harry.getsalary());
        System.out.println(harry.getname());

        harry.setname("Priyanshi verma");
        System.out.println(harry.getname());

                                                                            //problem2
        System.out.println(" ");
        CellPhone asus = new CellPhone();
        asus.ring();
        asus.call();
        asus.vibrate();

                                                                            //problem3
        System.out.println(" ");
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
