package com.SetterSetter;
 
public class Main {
 public static void main(String[] args) {
      
     Cricket player = new Cricket();
 
     player.setPlayerName("Virat Kohli");
     player.setTeamName("India");
     player.setRuns(12000);
     player.setWickets(4);
 
     System.out.println("Player Name: " + player.getPlayerName());
     System.out.println("Team Name: " + player.getTeamName());
     System.out.println("Runs Scored: " + player.getRuns());
     System.out.println("Wickets Taken: " + player.getWickets());
 }
}

