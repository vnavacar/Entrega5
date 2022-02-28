package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public static void Lanzar(Scanner teclado) {
		ArrayList<Float> array = new ArrayList<Float>();
		float numero = 0;
		
		System.out.println("Nota?");
		do{
			numero = teclado.nextFloat();
			
			if(numero != -1) {
				array.add(numero);
				System.out.println("Nota?");
			}
			
			
		}while(numero != -1);
		numero = 0;
		for(int j=0;j<array.size();j++) {
			numero = numero + array.get(j);
			
			}
		numero= numero/array.size();
		System.out.println("Nota media: "+numero);
		
	}

}

