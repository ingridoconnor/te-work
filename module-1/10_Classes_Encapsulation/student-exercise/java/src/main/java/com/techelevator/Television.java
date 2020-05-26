package com.techelevator;

public class Television {
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	
	

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void turnOff() {
		isOn = false;

	}

	public void turnOn() {
		isOn = true;
		this.currentVolume = 2;
		this.currentChannel = 3;

	}

	public void changeChannel(int newChannel) {
		if(isOn == true && (newChannel >= 3 && newChannel <= 18)) {
			currentChannel = newChannel;
		}

	}

	public void channelUp() {
		if (isOn == true && (this.currentChannel < 18)) {
			currentChannel+= 1;}
		else if (isOn == true && (this.currentChannel <= 18)) {
			this.currentChannel = 3;
		}

	}

	public void channelDown() {
		if(isOn == true && (this.currentChannel > 3)) {
			 currentChannel -= 1;}
		else if(isOn == true && (this.currentChannel <= 3)) {
				this.currentChannel = 18;
			}
			
		}

	

	public void raiseVolume() {
		if(isOn == true && currentVolume <= 10) {
			//if (currentVolume < 10);
			this.currentVolume++;
		}
		

	}

	public void lowerVolume() {
		if(isOn == true && currentVolume > 0) {
		//if(currentVolume >= 1);
		this.currentVolume--;
		}
		

	}
}
