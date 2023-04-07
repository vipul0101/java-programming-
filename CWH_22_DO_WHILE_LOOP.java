package com.company;
import java.util.Scanner;
public class CWH_22_DO_WHILE_LOOP {
    public static void main(String[] args) {
//        int b = 0;
//        do{
//            System.out.println(b);
//            b++;
//        }while(b<5);

        // QUICK QUIZ
        int c = 1;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        do{
            System.out.println(c);
            c++;
        }while(c<=d);
    }
}
