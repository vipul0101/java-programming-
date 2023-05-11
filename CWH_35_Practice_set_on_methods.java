package com.company;

public class CWH_35_Practice_set_on_methods {
    //problem 1
    static void multiplication(int y){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n" , y, i, y*i);
        }
    }

    //problrm 2
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //problem 3
    static int sumRec(int x){
        if(x==1){
            return 1;
        }
        return x + sumRec(x-1);
    }
    public static void main(String[] args) {

        //problem 1
        multiplication(5);

        //problem 2
        pattern1(5);

        //problem 3
        int c = sumRec(5);
        System.out.println(c);
    }
}
