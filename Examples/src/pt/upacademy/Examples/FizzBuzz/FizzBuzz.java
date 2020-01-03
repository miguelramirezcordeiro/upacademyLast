package pt.upacademy.Examples.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
	private Scanner sc = new Scanner(System.in);
	private int numCicle;

	public static void main(String[] args) {
		FizzBuzz myFizz = new FizzBuzz();
		myFizz.setNumCicle();
		myFizz.resolve();
	}

	public int getNumCicle() {
		return numCicle;
	}

	public void setNumCicle() {
		int value = 0;
		do {
			System.out.println("Coloque um valor entre 1 e 100");
			if (sc.hasNextInt()) {
				value = sc.nextInt();
			} else {
				sc.nextLine();
			}
		} while (value > 100 || value < 1);
		this.numCicle = value;
	}

	public void resolve() {
		String output = "1";
		for (int i = 2; i <= this.numCicle; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				output += ", FizzBuzz";
			} else if (i % 3 == 0) {
				output += ", Fizz";
			} else if (i % 5 == 0) {
				output += ", Buzz";
			} else {
				output += ", " + i;
			}
		}
		System.out.println(output);
	}
}
