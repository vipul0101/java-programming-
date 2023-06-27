package com.company;

class employee{
    private int id;
    private String name;

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
public class CWH_40_ACCESSMODIFIER {

    public static void main(String[] args) {

        employee harry = new employee();
        harry.setname("codewithharry");
        System.out.println(harry.getname());
        harry.setId(22);
        System.out.println(harry.getId());
    }

}
