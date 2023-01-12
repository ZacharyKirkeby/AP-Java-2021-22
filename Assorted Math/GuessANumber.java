package inClass;

import java.util.Scanner;

public class GuessANumber {
	
	public static void main(String[] args) {
		int RandomNumber = (int)Math.random()*100+1;
		play(RandomNumber);
		

	}
	public static void play(int r) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess: ");
		int guess = keyboard.nextInt();
		if (guess == r) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong");
		}	play(r);
	}

}
