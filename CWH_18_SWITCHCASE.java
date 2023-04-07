package com.company;
import java.util.Scanner;
public class CWH_18_SWITCHCASE {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("you are an adult");
            case 23 -> System.out.println("you are going to join a job");
            case 60 -> System.out.println("you are an adult");
            default -> System.out.println("enjoy your life");
        }
        System.out.println("thanx for using my java code");
    }
}
