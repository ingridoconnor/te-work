package com.techelevator;

public class HotelAssessment {

	private String name;
	private int numberOfNights;
	private double estimatedTotal;
	private boolean requiresCleaning;
	private boolean usedMinibar;
	
	

	public HotelAssessment(String name, int numberOfNights) {
		this.name = name;
		this.numberOfNights = numberOfNights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public double getEstimatedTotal() {
		return estimatedTotal;
	}

	public void setEstimatedTotal(double estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}
	public boolean isRequiresCleaning() {
		return requiresCleaning;
	}

	public void setRequiresCleaning(boolean requiresCleaning) {
		this.requiresCleaning = requiresCleaning;
	}

	public boolean isUsedMinibar() {
		return usedMinibar;
	}

	public void setUsedMinibar(boolean usedMinibar) {
		this.usedMinibar = usedMinibar;
	}
	public double total (boolean requiresCleaning, boolean usedMinibar) {
		if(usedMinibar == true && requiresCleaning == true) {
			return ((getNumberOfNights() * 59.99) + (12.99 + 34.99)) * 2;
		}if(usedMinibar == true && requiresCleaning == false) {
			return (getNumberOfNights() * 59.99) + 12.99;
		}if(usedMinibar == false && requiresCleaning == true) {
			return (getNumberOfNights() * 59.99) + 34.99;
		} return getEstimatedTotal();
	}

	@Override
	public String toString() {
		return "Reservation-" + name + " " +"estimatedTotal-" + " "
				+ estimatedTotal ;
	}

}
