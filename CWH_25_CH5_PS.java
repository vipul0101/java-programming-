package com.company;

public class CWH_25_CH5_PS {
    public static void main(String[] args) {
        //Problem 1
//        int n = 4;
//        for(int i = n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Problem 2
//        int sum = 0;
//        int d = 4;
//        for(int i=0; i<d; i++){
//            sum = sum + (2*i);
//        }
//        System.out.printf("the sum of first %d even numbers are :- \n" ,d);
//        System.out.println(sum);

        //Problem 3
//        int multiply = 1;
//        int a = 4;
//        for(int i = 1; i<=a; i++){
//            multiply = multiply*i;
//        }
//        System.out.printf("The multiply of first %d numbers are :- " ,a);
//        System.out.println(multiply);

        //Similar problem 3
//        int n = 5;
//        for(int i = 1; i<=10; i++){
//            System.out.printf("%d X %d = %d\n" ,n,i,n*i);
//        }
        //Problem 4
//        int n = 5;
//        for(int i = 10; i>=1; i--){
//            System.out.printf("%d X %d = %d\n" ,n,i,n*i);
//        }

        //Problem 5
//        int factorial = 1;
//        int a = 5;
//        for(int i = 1; i<=a; i++){
//            factorial = factorial*i;
//        }
//        System.out.printf("The factorial of first %d numbers are :- " ,a);
//        System.out.println(factorial);

        //Problem 6
//        int i=1;
//        int factorial = 1;
//        int n = 5;
//        while(i<=n){
//            factorial*= i;
//            i++;
//        }
//        System.out.printf("The factorial of first %d numbers are :-> " ,n);
//        System.out.println(factorial);

        //Problem 7
//        int n = 4;
//        int i = n;
//        while(i > 0) {
//            int j = 0;
//            while(j < i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }

        //problem 9
        int n = 8;
        int sum = 0;
        for(int i =1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
