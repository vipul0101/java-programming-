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

                                                                            //problem4
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
                                                                            }
                                                                            //problem5
class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
                                                                            }

public class CWH_39_Chapter_8_practiceset {
    public static void main(String[] args) {
        /*                                                                    //problem1
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

                                                                            //problem4
        System.out.println(" ");
        rectangle rec = new rectangle();
        rec.length = 24;
        rec.breadth = 55;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        */

                                                                            //problem5
        System.out.println(" ");
        tommy player1 = new tommy();
        player1.hit();
        player1.run();
        player1.fire();

    }
}
