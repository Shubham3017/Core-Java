package com.SetterSetter;

 
public class Cricket {
	
 private String playerName;
 private String teamName;
 private int runs;
 private int wickets;

 // Getter and Setter   
 public String getPlayerName() {
     return playerName;
 }
 public void setPlayerName(String playerName) {
     this.playerName = playerName;
 }

  
 public String getTeamName() {
     return teamName;
 }
 public void setTeamName(String teamName) {
     this.teamName = teamName;
 }

  
 public int getRuns() {
     return runs;
 }
 public void setRuns(int runs) {
     this.runs = runs;
 }

  
 public int getWickets() {
     return wickets;
 }
 public void setWickets(int wickets) {
     this.wickets = wickets;
 }
}

