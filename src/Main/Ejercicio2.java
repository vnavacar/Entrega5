package Main;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
	public static void Lanzar(Scanner teclado) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		int numero;
		
		System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
		do{
			numero = teclado.nextInt();
			
			if(numero != -1) {
				array.add(numero);
			}
			
			
		}while(numero != -1);
		
		
		
		
		
		
		
	}

}
