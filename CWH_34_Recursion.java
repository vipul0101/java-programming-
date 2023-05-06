package com.company;

public class CWH_34_Recursion {
    static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println("the factorial of the given value in n is :- "+ factorial(5));
    }
}
