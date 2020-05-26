package com.techelevator;

public class Elevator {
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;

	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void goDown(int desiredFloor) {
		if (doorOpen != true) {
			if (desiredFloor >= 1) {
				if (desiredFloor < currentFloor) {
					currentFloor = desiredFloor;
				}
			}
		}
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void openDoor() {
		doorOpen = true;
	}

	public void closeDoor() {
		doorOpen = false;
		// this.closeDoor;
	}

	public void goUp(int desiredFloor) {
		if (doorOpen != true) {
			if (desiredFloor <= numberOfFloors) {
				if (desiredFloor > currentFloor) {
					currentFloor = desiredFloor;
				}
			}
		}
	}
}
