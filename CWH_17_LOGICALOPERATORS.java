package com.company;

public class CWH_17_LOGICALOPERATORS {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("FOR LOGICAL NOT");
        System.out.println("NOT (a) is " + !a);
        System.out.println("NOT (b) is " + !b);
    }
}
