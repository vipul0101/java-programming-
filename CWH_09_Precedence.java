package com.company;

public class CWH_09_Precedence {
    public static void main(String[] args) {
//        here we are learning about precedence and associativity we can further explore it on goggle for more information
//        int a = 6*5-34/2;  // here precedence plays its role
//        int b = 60/5-34*2; // here associativity plays its role
//        System.out.println(b);

//        Quik quiz
        int x = 4;
        int y = 5;
        int k = x*y/2;
//        System.out.println(k);

        int a = 5;
        int b = 4;
        int c = 10;
        int d = b*b - (4*a*c)/(2*a);
        System.out.println(d);
    }
}
