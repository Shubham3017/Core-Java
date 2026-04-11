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

        
        obj1.name1 = "Mithali raj";
        obj1.name2 = "smriti mandhana";

        obj2.name1 = "harmanpreet kaur";
        obj2.name2 = "jhulan goswami";

        obj3.name1 = "deepti sharma";
        obj3.name2 = "shafali verma";

        obj4.name1 = "richa ghosh";
        obj4.name2 = "meg lanning";

        obj5.name1 = "sophie lanning";
        obj5.name2 = "ellyse perry";

        
        obj1.printNames();
        obj2.printNames();
        obj3.printNames();
        obj4.printNames();
        obj5.printNames();
    }
}

