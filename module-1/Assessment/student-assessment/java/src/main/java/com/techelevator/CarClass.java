package com.techelevator;

import java.time.LocalDate;

public class CarClass {	
private int year;
private String make;
private int carAge;
private boolean isClassic;




public CarClass (int year, String make, boolean isClassic) {
	this.year = year;
	this.make = make;
	this.isClassic = isClassic;
	this.carAge = LocalDate.now().getYear() - year;
}




public boolean isClassic() {
	return isClassic;
}




public void setClassic(boolean isClassic) {
	this.isClassic = isClassic;
}




public int getYear() {
	return year;
}




public void setYear(int year) {
	this.year = year;
}




public String getMake() {
	return make;
}




public void setMake(String make) {
	this.make = make;
}




public int getCarAge() {
	return carAge;
}




public void setCarAge(int carAge) {
	this.carAge = carAge;
}

public boolean check (int yearToCheck) {
	if(this.carAge < 4 || this.carAge > 25 || isClassic) {
		return false;
	} if (yearToCheck % 2 == 0 || yearToCheck % 2 != 0){
		return true;
	}else {
		
	}
	return false;
}
@Override
public String toString() {
	return "CAR - " + year +" - "+ make;
	
}





}

