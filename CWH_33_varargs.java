package com.company;

public class CWH_33_varargs {
    static int sum(int a, int ...arr){                                    // here this programme needs atleast 1 argument for returning the result
        int result = a;
        for(int x : arr){
            result += x;
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println("welcome in the lecture of varargs");
//        System.out.println("the sum of nothing is :- " + sum());         ** this does not need any value for returning something
        System.out.println("the value for atleast 1 argument is :- " + sum(5));
        System.out.println("the sum of two numbers is :- " + sum(2,3));
        System.out.println("the sum of three numbers is :- " + sum(5,6,8));
    }
}
