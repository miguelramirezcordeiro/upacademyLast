package pt.upacademy.Examples.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		System.out.println(myList);

		myList.add("Ze Carlos");
		myList.add("Ze Manel");
		myList.add("Sam");
		myList.add("Gata");
		System.out.println(myList);
		myList.remove("Ze Manel");
		System.out.println(myList);
		myList.remove(1);
		System.out.println(myList);
	}
}
