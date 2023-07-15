package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_41_EXERCISE2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // 0 for Rock
        //1 for Paper
        //2 for Scissor

        System.out.println("enter :- 0 for Rock or 1 for Paper or 2 for Scissor");
        int userInput = in.nextInt();

        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("you both draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("you win");
        }
        else{
            System.out.println("cpmputer wins");
        }
        System.out.println("where computer input is :- " + computerInput);

        if(computerInput == 0){
            System.out.println("computer choose :- Rock");
        }
        else if(computerInput == 1){
            System.out.println("computer choose :- Paper");
        }
        else{
            System.out.println("computer choose :- Scissor");
        }
    }
}
