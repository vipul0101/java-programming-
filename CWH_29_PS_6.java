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
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{3,5,7},
                         {8,9,4}};
        int [][]result = {{0,0,0},
                          {0,0,0}};
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){

                result [i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }

        //problem 5
        int [] arr = {1,2,4,5,8,9,7};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l,2);

        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }

        int [] arr2 = {2,66,4,58,987,8,5,445,564,202};
        int max = 0;
        for(int e:arr2){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the new max value from the given array is :- " + max);
    }
}
