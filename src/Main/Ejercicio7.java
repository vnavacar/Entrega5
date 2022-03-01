package Main;
//import java.util.Arrays;
import java.util.Random;

public class Ejercicio7 {
	
	public static void Lanzar() {
		
	    Random r = new Random();
		
		char[][] arr2d = new char[20][30];
		
		for(int i=0;i<20;i++) {
			
			for(int j=0;j<30;j++) {
				arr2d[i][j] = (char)(r.nextInt(26) + 'a');
				
			}
		
		}
		//System.out.println(Arrays.deepToString(arr2d));// no salta lineas
		for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.printf(arr2d[row][col] + "");
            }
            System.out.println();
        }
		
	}

}
