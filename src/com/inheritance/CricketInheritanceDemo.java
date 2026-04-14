package com.inheritance;

public class CricketInheritanceDemo {
    public static void main(String[] args) {
        Batsman batsman = new Batsman();
        batsman.play();   // Inherited method from CricketPlayer
        batsman.bat();    // Specific to Batsman

        Bowler bowler = new Bowler();
        bowler.play();    // Inherited method
        bowler.bowl();    // Specific to Bowler

        WicketKeeper keeper = new WicketKeeper();
        keeper.play();    // Inherited method
        keeper.keepWickets(); // Specific to WicketKeeper
    }
}
