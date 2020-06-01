package com.techelevator;

public class Fraction {
	//data memebers for fraction class
	private int numerator;
	private int demonator;

	public Fraction(int numerator, int demonator) {
		this.numerator = numerator;
		this.demonator = demonator;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object o) {
		Fraction f = (Fraction)o;
		if(numerator == f.numerator && demonator == f.demonator) {
			return true;
		}
		return false;
	}
	public int gcd (int num, int den) {
		num = Math.abs(num);
		den = Math.abs(den);
		while(num!= den) {
			if (num > den) {
				num = num - den;
			}else {
				den = den - num;
			}
		}return num;
	}
	public Fraction multiply(Fraction f) {
		return new Fraction (this.numerator * f.numerator, this.demonator * f.demonator);
	}
	public Fraction add(Fraction f) {
		return new Fraction(this.numerator + f.numerator, this.demonator);
	}
	}
		
	


