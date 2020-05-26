package com.techelevator;

public class Card {
	private String suit;
	private int value;
	private boolean isFaceUp;
	private String color;
	private String  faceValue;
	
	
	Card(String suit, int value) {
		isFaceUp = false;
		this.suit = suit;
		this.value = value;
		faceValue = "The " + value + " of " + suit;
	}
	public String getSuit() {
		
		return suit;
	}
	public int getValue() {
		return value;
	}
	public boolean isIsFaceUp() {
		return isFaceUp;
	}
	public  String getColor() {
		if(suit == "hearts" || suit == "diamonds") {
		return "red";
		}else {
			return "black";
		}
	}
	public String getFaceValue() {
		
		return faceValue;
	}
	public void turnOver() {
		isFaceUp = !isFaceUp;
	

	

	}
}

