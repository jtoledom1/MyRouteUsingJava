package Mouredev;

import java.util.ArrayList;
import java.util.List;

public class Variables {

	public static void main(String[] args) {
		System.out.println("Hola, Java");

		String myString = "Esto es una cadena";
		myString = "Aquí cambia el valor";
		System.out.println(myString);

		Integer myInt = 7;
		myInt = myInt + 14;
		System.out.println(myInt);
		System.out.println(myInt - 1);

		Double myDouble = 6.5;
		System.out.println(myDouble);

		Float myFloat = 6.5f;
		System.out.println(myFloat);

		System.out.println(myFloat + myDouble + myInt + myString);

		Boolean myBoolean = true;
		myBoolean = false;

		myBoolean = null;

		if (myBoolean != null) {
			System.out.println(myBoolean);
		} else {
			System.out.println("MyBoolean es nulo");
		}
		if (myInt == 11) {
			System.out.println("11");
		} else if (myInt == 12) {
			System.out.println("12");
		} else {
			System.out.println("Ni 11 ni 12");
		}
		
		List myArray =new ArrayList();
		//Crear objeto y luego hacer operaciones con el 
		myArray.add(myString);
		myArray.add(myInt);
		
		System.out.println(myArray);
		
		//Map<String> myMap = new HashMap()
	}

}
