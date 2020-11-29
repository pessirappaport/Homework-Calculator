
public class Homework6 {
//Pessi Rappaport
	public static void main(String[] args) {
		HwScore hw1 = new HwScore (26.5,30);
		HwScore hw2 = new HwScore (29,27.5);
		HwScore hw3 = new HwScore (0, 20);
		HwScore hw4 = new HwScore (16,20);
		hw1.printGrade(hw1.earnedPoints,hw1.possiblePoints);
		hw2.printGrade(hw2.earnedPoints,hw2.possiblePoints);
		hw3.printGrade(hw3.earnedPoints,hw3.possiblePoints);
		
		HwScore.printOverallGrade();
	}


	



	
}

	

	

