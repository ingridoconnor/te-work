package com.techelevator;

public class CarClass {	
private int year;
private String make;
private int carAge;




public CarClass (int year, String make, boolean isClassic) {
	this.year = year;
	this.make = make;
	isClassic = true;
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
	if(this.carAge < 4 || this.carAge > 25) {
		return false;
	} if (this.yearToCheck(year)% 2 == 0 || this.yearToCheck(year) % 2 != 0){
		return true;
	}else {
		
	}
	return false;
}
@Override
public String toString() {
	return "CAR - {year} - {make}";
	
}



private int yearToCheck(int year2) {
	return 0;
}


}

