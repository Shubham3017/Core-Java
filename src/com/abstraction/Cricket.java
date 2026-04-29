package com.abstraction;
 
abstract class Cricket { 
	
 abstract void play();
 
 void rules() {
     System.out.println("Basic rules: Two teams, bat and ball, runs and wickets.");
 }
}
 
class TestCricket extends Cricket {
 @Override
 void play() {
     System.out.println("Playing Test Cricket: 5 days match, white clothing, red ball.");
 }
}
 
class OneDayCricket extends Cricket {
 @Override
 void play() {
     System.out.println("Playing One Day Cricket: 50 overs per side, colored clothing.");
 }
}
 
class T20Cricket extends Cricket {
 @Override
 void play() {
     System.out.println("Playing T20 Cricket: 20 overs per side, fast-paced game.");
 }
}
 
 