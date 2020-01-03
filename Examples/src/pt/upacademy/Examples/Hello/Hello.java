package pt.upacademy.Examples.Hello;

import java.util.Scanner;

public class Hello {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Hello h = new Hello();
		h.start();
	}

	private void start() {
		System.out.println("Inserir nome : ");
		String nome = sc.nextLine();
		System.out.println("Hello " + nome + " : Inserir idade?");
		int idade = 0;
		do {
			if (sc.hasNextInt()) {
				idade = sc.nextInt();
			} else {
				sc.nextLine();
			}
			
		} while (idade == 0);
		
		
		System.out.println(nome + ", " + idade);
	}

}
