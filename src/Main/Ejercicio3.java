package Main;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio3{
    public Ejercicio3(){

        ArrayList<Float> notas=new ArrayList<Float>();
        Scanner teclado = new Scanner(System.in);
        int nota = 0;
        float entrada = 0;
        while (true) {
            System.out.println("¿Nota?");
            try {
                entrada = teclado.nextFloat();

            } catch (InputMismatchException e) {
                teclado.next();
            }
            if (entrada == -1) {
                break;
            } else {
                notas.add(entrada);
            }
        }
        for(float num :notas){
            nota+=num;
        }
        float media=nota/notas.size();
        System.out.println("Tu media es: " + media);

    }
}
