package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	//private String letterGrade;
	
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
		
	}
	
	
	public String getLetterGrade() {
		if(( (double)earnedMarks / possibleMarks) * 100 >= 90){
			return "A";
		}else if (((double)earnedMarks /possibleMarks) * 100 >= 80) {
			return "B";
		}else if (((double)earnedMarks / possibleMarks) * 100 >= 70) {
			return "C";
		}else if (((double)earnedMarks / possibleMarks) * 100 >= 60) {
			return "D";
		}else
		return "F";
	}
	
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}


	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}


	public int getEarnedMarks() {
		
		return earnedMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}
	

}
