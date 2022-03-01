package Main;

import java.util.Scanner;

public class Ejercicio9 {
	public static void Lanzar(Scanner teclado) {
		
		
		char[][] arr2d = new char[3][3];
		
		boolean jugador = false; // false para jugador 2, true para 1
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
			if(fila < 0 || columna < 0 || fila > 3 || columna > 3) {
				System.out.println("Posicion fuera de la tabla, vuelva a intentar!");
				}
			else if(arr2d[fila][columna] != '-') {
				System.out.println("Esta posicion ya ha sido cambiada, vueva a intentar!");
				}
			else {
				if(jugador) {
					arr2d[fila][columna]='X';
					jugador = !jugador;
				}else {
					arr2d[fila][columna]='O';
					jugador = !jugador;
				}
			}
			Imprimirtabla(arr2d);
			if(Ganoalguien(arr2d) == 'X') {
				System.out.println("Gano el jugador 1(X)!");
				gameOver = true;
				
			}
			else if(Ganoalguien(arr2d) == 'O'){
				System.out.println("Gano el jugador 2(O)!");
				gameOver = true;
			}else if(tablaLlena(arr2d)) {
				System.out.println("Tabla llena, empate.");
				gameOver = true;
			}
			
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
	public static char Ganoalguien(char[][] tabla) {
		
		for(int i = 0; i < 3; i++) { // verficando filas
			if(tabla[i][0] == tabla[i][1] && tabla[i][1] == tabla[i][2] && tabla[i][0] != '-') {
				return tabla[i][0];
			}
		}
		for(int j = 0; j < 3; j++) { //verificando columnas
			if(tabla[0][j] == tabla[1][j] && tabla[1][j] == tabla[2][j] && tabla[0][j] != '-') {
				return tabla[0][j];
			}
		}
		//las 2 diagonales
		if(tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2] && tabla[0][0] != '-') {
			return tabla[0][0];
		}
		if(tabla[2][0] == tabla[1][1] && tabla[1][1] ==  tabla[0][2] && tabla[2][0] != '-') {
			return tabla[2][0];
		}
		return '-';// Si nadie ha ganado

	}
	public static boolean tablaLlena(char[][] tabla) {
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(tabla[i][j] == '-') {
					return false;
					
					
				}
				
				}
			}
		return true;
	}

}
