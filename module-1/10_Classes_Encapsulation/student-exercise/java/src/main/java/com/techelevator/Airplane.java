package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	private int availableFirstClassSeats;
	
	


	public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		availableCoachSeats = totalCoachSeats - bookedCoachSeats;
		return this.availableCoachSeats;
	}
	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		return this.availableFirstClassSeats;
	}
	
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats ) {
		if (forFirstClass == true){
			if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
				bookedFirstClassSeats = bookedFirstClassSeats+ totalNumberOfSeats;
				return true;
			} else {
				return false;
			}			
		}
		else {
			if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
				bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
				return true;
			} else {
			return false;
			} 
		}
	}
		
	}
