package Main;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
		
		do {
			menu();
			numero= teclado.nextInt();
			
			switch(numero) {
			
			case 1:
				//Ejercicio1(teclado);


				Ejercicio1.Lanzar();
				
				
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				System.out.println("Terminando");
				break;

			
			}
			
			
		}while(numero != 11); // condicion de salida
		teclado.close();
	}
	
    private static void menu()
    {
        System.out.println("Que quieres hacer?");
        System.out.println("1. Despegue inmediato");
        System.out.println("2. Numero de ocurrencias");
        System.out.println("3. Nota media version 4");
        System.out.println("4. Maquina de votar");
        System.out.println("5. Palindromo");
        System.out.println("6. Que hace?");
        System.out.println("7. Matriz");
        System.out.println("8. Micro guerra de barcos");
        System.out.println("9. tres en raya");
        System.out.println("10. Registro de empleados");
        System.out.println("11. Salir");
    }
}