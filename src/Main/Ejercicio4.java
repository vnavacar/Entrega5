package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
	public static void Lanzar(Scanner teclado) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int numero;
		float porcentaje;
		do{
			candidatos();
			numero = teclado.nextInt();
			
			if(numero == 1 || numero == 2 || numero == 3 || numero == 4) {
				
				array.add(numero);
			}
			
		}while(numero != 68753421);
		System.out.println(array.toString()); // para debugear, quita antes de entregar
		System.out.println("Resultados:");
		numero =0;
		for(int i=1;i<5;i++) {
			
			for(int j=0;j<array.size();j++) {
				if(array.get(j)==i) {
					numero++;
				}
			}
			porcentaje = ((numero/array.size())*100);
			System.out.println("Porcentaje de votos del candidato "+i+ " son:"+porcentaje+"%" );
			numero =0;
			
			}
		
	}
    private static void candidatos()
    {
        System.out.println("Elija Entre:");
        System.out.println("1. Emilia TERREROS");
        System.out.println("2. Gerardo ESCODAR");
        System.out.println("3. Maria AGUAVIVA");
        System.out.println("4. Nadia LETUX");
    }
}
