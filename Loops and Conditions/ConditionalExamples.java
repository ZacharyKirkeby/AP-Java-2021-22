package inClass;

import java.util.Scanner;

public class ConditionalExamples {
	public static void voterMessage(int age) {
		Scanner keyboard = new Scanner(System.in);
		if (age >= 18) {
			System.out.println("You can vote! \nDo you know your polling place?");
			String where = keyboard.nextLine();

		} else {
			System.out.println("You have " + (18 - age) + " years until you can vote");
		}

	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How old are you?");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		voterMessage(age);
	}

}