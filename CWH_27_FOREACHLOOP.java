package com.company;

public class CWH_27_FOREACHLOOP {
    public static void main(String[] args) {
        int [] marks = {100,98,88,56,44,55,55};
        float [] marks2 = {100,98,88,56,44,55,55};
        String [] students = {"rohan", "satish", "shubham", "rahul"};

//        System.out.println(marks.length);

        // we can access all the elements of arrays using for loops
//        for(int i =0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
        //again for printing the whole array in reverse order we can use decrementing for loop
//        for(int i=marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }

        // Now we are here doing FOR EACH LOOP
        for(int element:marks){
            System.out.println(element);
        }

    }
}
