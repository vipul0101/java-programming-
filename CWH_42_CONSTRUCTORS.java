package com.company;
class mainEmployee1{
    private int id;
    private String name;
    // WE CAN ALSO DO METHODS OVERLOADING HERE FOR MORE COMPATIBILITY
//    public mainEmployee1(){
//        id = 12;
//        name = "codewithharry";
//    }
    public mainEmployee1(String myName, int myId){
        id = myId;
        name = myName;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setId(int n1){
        id = n1;
    }
    public int getId(){
        return id;
    }
}
public class CWH_42_CONSTRUCTORS {
    public static void main(String[] args) {
        mainEmployee1 harry = new mainEmployee1("codewithharry" , 25);
        System.out.println(harry.getId());
        System.out.println(harry.getname());
    }
}
