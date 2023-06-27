package com.company;

class Employees{
    int id;
    String name;
    int salary;


    public void printDetails(){
        System.out.println("My id is :- " + id);
        System.out.println("My name is :- " + name);
        System.out.println(name + "'s salary is :- " + salary + "k");
    }
    public int getsalary(){
        return salary;
    }
}

public class CWH_38_OOPS {
    public static void main(String[] args) {
        System.out.println("This is a new costum class");

        Employees harry = new Employees();   // Instantiating a new Employees object
        Employees john = new Employees();    // Instantiating a new Employees object

        //Setting attributes
        harry.id = 12;
        harry.name = "porter black";
        harry.salary = 5688;

        //Setting attributes for john
        john.id = 50;
        john.name = "john Dick";
        john.salary = 66000;

        //printing the attributes for harry
        System.out.println(" ");
        System.out.println("printing details of harry");
        harry.printDetails();
//        int salary2 = harry.getsalary();
//        System.out.println(salary2);
        //printing the attributes for john
        System.out.println(" ");
        System.out.println("printing details of john");
        john.printDetails();
        int salary = john.getsalary();
        System.out.println(salary);


    }
}
