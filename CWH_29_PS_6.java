package com.company;

public class CWH_29_PS_6 {
    public static void main(String[] args) {
        //problem 1
        float [] marks = {49.8f, 55.5f, 66.3f, 58.9f, 45.4f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The sum of floating marks are " + sum);

        System.out.println("\n");

        //problem 2
        //taking input from marks
        float num = 47.5f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("tne number is present in the array");

        }
        else{
            System.out.println("the num is not present in the array");
        }

        //problem 3
        //same again taking input from the marks
        float sum1 = 0;
        for(float element:marks){
            sum1 = sum1 + element;
        }
        System.out.println("The value of average marks is :- " + sum1/marks.length);


        //problem 4
        
    }
}
