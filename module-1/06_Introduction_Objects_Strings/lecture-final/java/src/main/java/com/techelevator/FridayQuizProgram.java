package com.techelevator;

public class FridayQuizProgram {

	public static void main(String[] args) {
		int answer = 0;

		for (int i = 0; i < 10; i++) {

			if (i % 3 != 0) {

				answer = answer + i;

			}
			if (i == 4) { // will cause to break out of loop when i = 4
				break;
			}

		}

		System.out.println(answer);

	

	int sum = 0;

	for(
	int i = 10;i>0;i-=5)
	{

		sum += i; // sum = sum + i;

	}

	System.out.println(sum);

	}
}
