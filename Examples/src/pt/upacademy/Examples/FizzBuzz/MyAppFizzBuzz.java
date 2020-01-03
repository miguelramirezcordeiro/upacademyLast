package pt.upacademy.Examples.FizzBuzz;

public class MyAppFizzBuzz {

	public static void main(String[] args) {
		System.out.println("MyApp Class");
		
		FizzBuzz myFizz = new FizzBuzz();
		
//		System.out.println("myFizz.numCicle : " + myFizz.numCicle);
		System.out.println("myFizz.getNumCicle() : " + myFizz.getNumCicle());
		
		myFizz.setNumCicle();
		myFizz.resolve();
	}

}
