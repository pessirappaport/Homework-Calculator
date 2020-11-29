
	//Pessi Rappaport
	public class HwScore {
	public double earnedPoints,possiblePoints;
	private static String letter;
	private static double totalEarnedPoints,totalPossiblePoints;
	HwScore(double earned, double possible){ //two=part parameter for constructor
		earnedPoints=earned;
		possiblePoints=possible;
		
		totalEarnedPoints+=earnedPoints;
		totalPossiblePoints+=possiblePoints;
		
	}
	
	
		
	private static String letterScore(double earned, double possible) { //method to get letter grade
		double score = earned/possible;
		if (score>=.90) {
			return "A";
			
		}
		else if (score>=.80) {
			return "B";			
		}
		else if (score>=.70) {
			return "C";			
		}		
		else if (score>=.60) {
			return "D";			
		}
		else { 
			return "F";
		}
	}


	public static void printGrade(double earnedPoints,double possiblePoints) { //method to print letter score for hw1,hw2,hw3
		letter = letterScore(earnedPoints,possiblePoints);
		System.out.println("On this homework, you earned "+earnedPoints+" out of "+possiblePoints+" possible points: "+ letter);
	}
	public static void printOverallGrade() {
		letter = letterScore(totalEarnedPoints,totalPossiblePoints);
		System.out.println("On all homework, you earned "+totalEarnedPoints+" out of "+totalPossiblePoints+" possible points: "+ letter);
		
}
	}


	
		
		
	

