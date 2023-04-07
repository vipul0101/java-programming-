package com.company;
import java.util.Scanner;
public class CWH_20_2ndExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        a = sc.next();
        b = sc.next();

        if((a.equals("R") && b.equals("S")) || (a.equals("S") && b.equals("P")) || (a.equals("P") && b.equals("R"))){
            System.out.println("a wins the game");
        }
        else if((a.equals("S") && b.equals("R")) || (a.equals("P") && b.equals("S")) || (a.equals("R") && b.equals("P"))){
            System.out.println("b wins the game");
        }
        else{
            System.out.println("no one wins the game");
        }

    }
}
