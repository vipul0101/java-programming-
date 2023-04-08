package com.company;

public class CWH_24_BREAK_STATEMENT {
    public static void main(String[] args) {
//        for(int i=0; i<=50; i++){
//            System.out.println(i);
//            System.out.println("you r great");
//            if(i==2){
//                System.out.println("BREAK");
//                break;
//            }
//        }

        //Continue statement
        for(int n=0; n<=6; n++){
            if(n==2){
                System.out.println(n);
                System.out.println("Here we skip 2nd iteration");
                continue;
            }
            System.out.println(n);
            System.out.println("you r great");
        }
    }
}
