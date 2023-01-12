package inClass;

import java.util.Scanner;

public class ConditionalExamples2 {
	
	public static void printAge(int year) {
		int age = 2021 - year;
		System.out.println("You are " + age + " years old.");
	}
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("Hello " + name);
		System.out.println("What year were you born?");
		int year = keyboard.nextInt();
		keyboard.nextLine();
		printAge(year);
		System.out.println("Have you had your birthday yet?");
		
	

	}

}
