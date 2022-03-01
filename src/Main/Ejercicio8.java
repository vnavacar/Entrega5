package Main;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio8 {
	public static void Lanzar(Scanner teclado) {
		
	    Random r = new Random();
	    int i_obj = r.nextInt(4);
	    int j_obj = r.nextInt(4);
	    int columna =-1;
	    int fila = -1;
	    //System.out.println("i"+i_obj+"j"+j_obj);
		
		char[][] arr2d = new char[4][4];
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				arr2d[i][j]='?';
				
				}
			}
		//System.out.println(Arrays.deepToString(arr2d));
		Imprimirtabla(arr2d);
		
		do {
			System.out.println("Que fila?");
			columna = teclado.nextInt() -1;
			System.out.println("Que columna?");
			fila = teclado.nextInt() -1;
			if(columna != i_obj && fila != j_obj) {
				arr2d[columna][fila] = '~';
				System.out.println("Agua");
				Imprimirtabla(arr2d);
			}
			
			}while(columna != i_obj && fila != j_obj);
		
		System.out.println("Tocado y hundido");
		System.out.println("Ha ganado");

		
		
		
	}

private static void Imprimirtabla(char[][] arr2d)
{
	
	for(int i=0;i<4;i++) {
		
		for(int j=0;j<4;j++) {
			
			System.out.printf(arr2d[i][j] + "");
			
			}
		System.out.println();
		}
	
}
}
