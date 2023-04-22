package com.company;

public class CWH_32_MethodsOverloading {
    static void change(int a){
        a = 98;
    }

    static void change(int [] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("What do you call an ant who fights crime? A vigilANTe!");
    }
    public static void main(String[] args) {
//        telljoke();

        int x = 45;
        change(x);
        System.out.println("the new value of x is : " + x);

        int [] marks = {56, 65, 59, 48, 88, 99};
        for(int j=0; j<marks.length; j++){
            System.out.print(marks[j]);
            System.out.print(" ");
        }
        System.out.println(" ");
        change(marks);
        System.out.println("the new value of marks[0] is : " + marks[0]);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
            System.out.print(" ");
        }


    }
}
