package com.company;
import java.util.Scanner;
public class CWH_23_FORLOOP {
    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++){
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n for getting the value of first n odd numbers");
//        int b = sc.nextInt();
//        System.out.println("this programme shows the first n odd numbers");
//        for(int n = 0; n<=b; n++){
//            System.out.println("2 x "+ n + " + 1 =  " + 2*n+1);
//        }
        int n = sc.nextInt();
        System.out.println("this programme will print natural numbers in reverse orders");
        for(int i = n; i>0; i--){
            System.out.println(i);
        }
        
    }
}
