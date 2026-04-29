package com.abstraction;

public class CricketAbstraction {
	 public static void main(String[] args) {
	     // Using abstraction: reference of Cricket, object of subclasses
	     Cricket match;

	     match = new TestCricket();
	     match.rules();
	     match.play();

	     match = new OneDayCricket();
	     match.rules();
	     match.play();

	     match = new T20Cricket();
	     match.rules();
	     match.play();
	 }
	}

