package Main;

import java.util.Scanner;

public class Ejercicio9 {
	public static void Lanzar(Scanner teclado) {
		
		
		char[][] arr2d = new char[3][3];
		
		boolean jugador = false; // false para jugador , true para 2
		boolean gameOver = false;
		int fila;
		int columna;
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				arr2d[i][j]='-';
				
				}
			}
		Imprimirtabla(arr2d);
		System.out.println("Juguemos a 3 en raya!");
		
		do {
			if(jugador) {
				System.out.println("Turno del jugador 1(X)");
			}else {
				System.out.println("Turno del jugador 2(O)");
			}
			System.out.println("Que fila?");
			fila = teclado.nextInt() -1;
			System.out.println("Que columna?");
			columna = teclado.nextInt() -1;
			if(jugador) {
				arr2d[fila][columna]='X';
			}else {
				arr2d[fila][columna]='O';
			}
			Imprimirtabla(arr2d);
			
			
			}while(!gameOver);
		
	}
	
	private static void Imprimirtabla(char[][] arr2d)
	{
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.printf(arr2d[i][j] + "");
				
				}
			System.out.println();
			}
		
	}

}
