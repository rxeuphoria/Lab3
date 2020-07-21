import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String runAgain;

		do {
			System.out.println("Please enter a number between 1 and 100.");
			int userNum = scnr.nextInt();
		while (userNum <= 0 || userNum >= 101) {
				System.out.println("Invalid number. Please enter a number between 1 and 100.");
				userNum = scnr.nextInt();
			}
		
		if (userNum % 2 == 0 && userNum < 25) {
			System.out.println("Even and less than 25.");
		} else if (userNum % 2 == 0 && userNum > 60) {
			System.out.println(userNum + " Even");
		} else if (userNum % 2 == 0) {
			System.out.println("Even.");
		} else if (userNum > 60) {
			System.out.println("Odd and over 60.");
		} else {
			System.out.println("Odd.");
		}
		
		System.out.println("Continue? y/n");
		runAgain = scnr.next();
		} while (runAgain.equalsIgnoreCase("y"));
		
		System.out.println("Later, gator.");
	}
}
