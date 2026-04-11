package com.constructor;

class cricketer {
    private String name;

    cricketer(String playerName) {
        this.name = playerName;
    }

    public void display() {
        System.out.println("Cricketer: " + name);
    }

    public static void main(String[] args) {
        cricketer c1 = new cricketer("Virat Kohli");
        cricketer c2 = new cricketer("MS Dhoni");
        cricketer c3 = new cricketer("Sachin  Tendulkar");
        cricketer c4 = new cricketer("Rohit Sharma");
        cricketer c5=  new cricketer("jaspreet bumrah");
        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        }
}

