package pt.upacademy.Examples.FizzBuzz;

import pt.upacademy.Examples.ScannerUtils.ScannerUtils;

public class FizzBuzzWithScannerUtils {
	private ScannerUtils sc = new ScannerUtils();
	private int numCicle;

	public static void main(String[] args) {
		FizzBuzzWithScannerUtils myFizz = new FizzBuzzWithScannerUtils();
		myFizz.setNumCicle();
		myFizz.resolve();
	}

	public int getNumCicle() {
		return numCicle;
	}

	public void setNumCicle() {
		this.numCicle = sc.getValidInt("Coloque um valor entre ", 1, 100);
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
