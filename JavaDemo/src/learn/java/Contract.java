package learn.java;

import java.util.Scanner;

public class Contract {
	public static void main(String[] args) {
		boolean yn = true;
		String answer;
		Scanner input = new Scanner(System.in);
		System.out.println("Is the contract signed? (yes/no)");
		answer = input.nextLine();
		if (answer.equals("yes")) {
			yn = true;
		} else if (answer.equals("no")) {
			yn = false;
		}

		if (yn == true) {
			System.out.println("really? it's " + answer + ". Congratulation! this is what you're waiting for");
		}
		else {
			System.out.println("oh no! get your ass working and get a new job!");
		}
	} 
}