package Main;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
	public static void Lanzar(Scanner teclado) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		int numero;
		int cuenta;
		
		System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
		do{
			numero = teclado.nextInt();
			
			if(numero != -1) {
				array.add(numero);
				System.out.println("Otro valor, por favor o -1 para terminar...");
			}
			
			
		}while(numero != -1);
		
		
		for(int i=0;i<10;i++) {
			cuenta =0;
			for(int j=0;j<array.size();j++) {
				if(array.get(j)==i) {
					cuenta++;
				}
				
				
			}
			
		}
		
		
		
		
		
	}

}
