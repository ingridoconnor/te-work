package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	public List<Integer>  factorize(int num) {
		
		List<Integer> primeList = new ArrayList<>();
		
		if(num > 1) {
			int i = 2; 
			
			while(i <= num) {
				if(num % i == 0) {
					primeList.add(i);
					num = num / i;
					i = 2;
				}else {
					i++;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		return primeList;
		
	}

}
