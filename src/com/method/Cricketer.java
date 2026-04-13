package com.method;
 
//Define a Cricketer class
public class Cricketer {
 String name;
 String country;
 String role;

 // Method to display cricketer info
 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Country: " + country);
     System.out.println("Role: " + role);
     System.out.println();
 }

 public static void main(String[] args) {
      
     Cricketer c1 = new Cricketer();
     c1.name = "Sachin Tendulkar";
     c1.country = "India";
     c1.role = "Batsman";

     Cricketer c2 = new Cricketer();
     c2.name = "Virat Kohli";
     c2.country = "India";
     c2.role = "Batsman";

     Cricketer c3 = new Cricketer();
     c3.name = "MS dhoni";
     c3.country = "India";
     c3.role = "Wicketkeeper-Batsman";

     Cricketer c4 = new Cricketer();
     c4.name = "Brian Lara";
     c4.country = "West Indies";
     c4.role = "Batsman";

     Cricketer c5 = new Cricketer();
     c5.name = "Shane Warne";
     c5.country = "Australia";
     c5.role = "Bowler";

     // Print their information
     System.out.println("Cricketer Information:");
     System.out.println("----------------------");
     c1.displayInfo();
     c2.displayInfo();
     c3.displayInfo();
     c4.displayInfo();
     c5.displayInfo();
 }}

