package com.techelevator.game;

public abstract class Game {
	private int numberOfPlayers;
	public Game(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
		
	}
	
	public abstract void setup (int numberOfPlayers);
	public abstract void takeTurn(int player);
	public abstract boolean isGameOver();
	public abstract void finishGame();
	
	
	public final void playGame() {
		setup(numberOfPlayers);
		for (int i = 0; !isGameOver(); i = (i + 1) % numberOfPlayers) {
			takeTurn(i + 1);
			
		}
		finishGame();
	}

}
