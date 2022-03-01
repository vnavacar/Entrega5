package Main;

import java.util.Scanner;

public class Ejercicio5 {

	public static void Lanzar(Scanner teclado) {
		
		String palabra =  "";
		String invertido = "";
		System.out.println("Escriba una palabra y después #");
		teclado.nextLine(); // para consumir /n
		//palabra = teclado.nextLine(); // esta es saltada, porque?
		palabra = teclado.nextLine();

		for(int i=palabra.length()-1;i>=0;i--) {
			if(palabra.charAt(i)!= '#') {
				invertido = invertido + palabra.charAt(i);
				}
		}
		invertido = invertido + '#';
		System.out.println(invertido);
		if(invertido.equals(palabra)) {
			System.out.println(palabra+" es un palindromo");
		}
		else {
			System.out.println(palabra+" no es un palindromo");
		}
	}
	
}
