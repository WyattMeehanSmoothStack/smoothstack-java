import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
	static Random rng = new Random();
	static String intro = "Hello! Please guess a number between 1-100.";
	static Scanner scanner = new Scanner(System.in);
	static int correctAns = rng.nextInt(100) + 1; // random.nextInt(max - min + 1) + min

	public static void main(String[] args) {
		System.out.println(intro); //Print the intro once

		for (int i = 0; i < 5; i++) {
			int guess = scanner.nextInt();
			if (guess >= correctAns - 10 && guess <= correctAns + 10) {
				System.out.println("Great guess! The correct answer was: " + correctAns);
				System.exit(0);
			} else if (i < 4) {
				System.out.println("Sorry that guess is not within 10 of the correct answer, please guess again!");
			}

		}

		System.out.println("Sorry, the answer was: " + correctAns);
	}

}
