package com.company;
import java.util.Scanner;

public class CWH_13_Strings{
    
    public static void main(String[] args){
//        String name = new String("Harry");
//        System.out.println(name);
//        int a = 5;
//        float b = 6.522f;
//        System.out.printf("the value of a is %d and the value of b is %f", a, b);
//        System.out.println();
//        System.out.format("the value of a is %d and the value of b is %f", a, b);

        Scanner sc = new Scanner(System.in);
        String st = sc.next();         // here only first word is taken from the sentence
        String st2 = sc.nextLine();   // here something strange happens go run and explore threw it
        System.out.println(st);
        System.out.println(st2);


    }


}
