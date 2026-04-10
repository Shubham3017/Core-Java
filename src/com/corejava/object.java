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
        // Create 5 objects
        Cricketer obj1 = new Cricketer();
        Cricketer obj2 = new Cricketer();
        Cricketer obj3 = new Cricketer();
        Cricketer obj4 = new Cricketer();
        Cricketer obj5 = new Cricketer();

        // Assign names directly
        obj1.name1 = "Virat Kohli";
        obj1.name2 = "Rohit Sharma";

        obj2.name1 = "MS Dhoni";
        obj2.name2 = "Sachin Tendulkar";

        obj3.name1 = "Kane Williamson";
        obj3.name2 = "Steve Smith";

        obj4.name1 = "Ben Stokes";
        obj4.name2 = "David Warner";

        obj5.name1 = "Jasprit Bumrah";
        obj5.name2 = "Babar Azam";

        // Print all names
        obj1.printNames();
        obj2.printNames();
        obj3.printNames();
        obj4.printNames();
        obj5.printNames();
    }
}

