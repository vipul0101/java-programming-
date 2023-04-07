package com.company;

public class CWH_15_2Practiceset {
    public static void main(String[] args){
        //Problem 1
        String name = "HARRY IS RIGHT";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "to lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|> , Thanx a lot";
        letter = letter.replace("<|name|>" , "harry");
        System.out.println(letter);

        //Problem 4
        String mystring = "This string contains  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Problem 5
        String myletter = "Dear harry, \n\tthis java course is good.\n thanx";
        System.out.println(myletter);

    }
}
