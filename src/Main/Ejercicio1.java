package Main;
//import java.util.Scanner;



public class Ejercicio1 {

	//public Ejercicio1(Scanner teclado) {
	public static void Lanzar() {
		
		int [] tabla;
		
		tabla = new int[11]; 
		
		for(int i=0;i<11;i++) {
			
			tabla[10-i] = i;
			System.out.println("Posicion:"+ (10-i) +"contiene:"+i);
		}
		System.out.println("Array creado, listando");
		for(int i=0;i<11;i++) {
			
			System.out.println("Posicion:"+i+"contiene:"+tabla[i]);
		}

	}


	
}
