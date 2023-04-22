package com.company;

public class CWH_31_METHODS {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = x*y + 5;
        }
        return z;
    }

    public static void main(String[] args){

        int a = 2;
        int b = 5;
        int c = logic(a,b);
        System.out.println(c);

        int f = logic(5,4);
        System.out.println(f);

    }
}
