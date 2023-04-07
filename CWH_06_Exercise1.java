package com.company;
import java.util.Scanner;

public class CWH_06_Exercise1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks for subject 1 : " );
        int subject1 = scan.nextInt();
        System.out.println("Enter marks for subject2 : " );
        int subject2 = scan.nextInt();
        System.out.println("Enter marks for subject3 : " );
        int subject3 = scan.nextInt();
        System.out.println("Enter marks for subject3 : " );
        int subject4 = scan.nextInt();
        System.out.println("Enter marks for subject3 : " );
        int subject5 = scan.nextInt();

        float percentage = ((subject1 + subject2 + subject3 + subject4 + subject5)/500.0f)*100;

        System.out.println(percentage);
    }
}
