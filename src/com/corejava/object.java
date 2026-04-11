package com.corejava;

class Cricketer {
    String name1;
    String name2;

    void printNames() {
        System.out.println(name1);
        System.out.println(name2);
    }
}

public class object {
    public static void main(String[] args) {
        
        Cricketer obj1 = new Cricketer();
        Cricketer obj2 = new Cricketer();
        Cricketer obj3 = new Cricketer();
        Cricketer obj4 = new Cricketer();
        Cricketer obj5 = new Cricketer();

        
        obj1.name1 = "virat kohli";
        obj1.name2 = "rohit sharma";

        obj2.name1 = "shreyas iyar";
        obj2.name2 = "hardik pandya";

        obj3.name1 = "krunal pandya";
        obj3.name2 = "suresh raina";

        obj4.name1 = "jaspreet bumrah";
        obj4.name2 = "sachin tendulker";

        obj5.name1 = "rajat patidar";
        obj5.name2 = "devdutt paddikal";

        
        obj1.printNames();
        obj2.printNames();
        obj3.printNames();
        obj4.printNames();
        obj5.printNames();
    }
}

