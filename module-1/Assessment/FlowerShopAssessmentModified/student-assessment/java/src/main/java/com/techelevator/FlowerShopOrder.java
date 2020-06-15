package com.techelevator;

public class FlowerShopOrder {

	private String bouquetType;
	private int numberOfRoses;
	private double subtotal;
	
	// these two are not needed
//	private boolean sameDayDelivery;
//	private String zipcode;
	
	

public FlowerShopOrder(String bouquetType, int numberOfRoses) {
	this.bouquetType = bouquetType;
	this.numberOfRoses = numberOfRoses;
	this.subtotal = 19.99 + (getNumberOfRoses() * 2.99);
}
	
	
	
	
//public boolean isSameDayDelivery() {
//		return sameDayDelivery;
//	}
//
//
//
//	public void setSameDayDelivery(boolean sameDayDelivery) {
//		this.sameDayDelivery = sameDayDelivery;
//	}
//
//
//
//	public String getZipcode() {
//		return zipcode;
//	}
//
//
//
//	public void setZipcode(String zipcode) {
//		this.zipcode = zipcode;
//	}

	
	public String getBouquetType() {
		return bouquetType;
	}
	public void setBouquetType(String bouquetType) {
		this.bouquetType = bouquetType;
	}
	public int getNumberOfRoses() {
		return numberOfRoses;
	}
	public void setNumberOfRoses(int numberOfRoses) {
		this.numberOfRoses = numberOfRoses;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double delivery(boolean sameDayDelivery, String zipcode) {
		
		// uses your zipcode variable that is passed in ^^^
//		if(getZipcode().charAt(0)=='2') {
//			return 3.99;
//		}if(getZipcode().charAt(0)=='2'&& sameDayDelivery) {
//			return 5.98;
//		}if(getZipcode().charAt(0)== '3') {
//			return 6.99;
//		}if(getZipcode().charAt(0)== '3' && sameDayDelivery) {
//			return 12.98;
//		}if(getZipcode().charAt(0)=='1') {
//			return 0.00;
		if(zipcode.charAt(0)=='2') {
			return 3.99;
		}if(zipcode.charAt(0)=='2'&& sameDayDelivery) {
			return 5.98;
		}if(zipcode.charAt(0)== '3') {
			return 6.99;
		}if(zipcode.charAt(0)== '3' && sameDayDelivery) {
			return 12.98;
		}if(zipcode.charAt(0)=='1') {
			return 0.00;
		}return 0.00;
	}
	@Override
	public String toString() {
		return "ORDER -" + getBouquetType() + " - " + getNumberOfRoses() + "roses -" + getSubtotal();
	}
	

}
