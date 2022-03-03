package Main;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6{
    public static void Lanzar(Scanner teclado){
       
        int eleccion = 0;
        while (true) {
            System.out.println("1: Ver original");
            System.out.println("2: Ver apartado 1");
            System.out.println("3; Ver apartado 2");
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (eleccion) {
                case 1:
                    original o = new original();
                    break;
                case 2:
                    e1 e = new e1();
                    break;
                case 3:
                    e2 e2 = new e2();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}
class original {

    public  original() {
        System.out.println("Original");
        int tamanio = 3;
        int i;
        int j;
        int val = 1;
        int tab2d[][] = new int[tamanio][tamanio];
        tamanio = 3; //original
        for (j = 0; j < tamanio; j++) {
            for (i = 0; i < tamanio; i++) {
                tab2d[j][i] = val;

                val++;
            }

        }
        System.out.println("0|0: " + tab2d[0][0]);
        System.out.println("1|0: " + tab2d[1][0]);
        System.out.println("2|0: " + tab2d[2][0]);

        System.out.println("0|1: " + tab2d[0][1]);
        System.out.println("1|1: " + tab2d[1][1]);
        System.out.println("2|1: " + tab2d[2][1]);

        System.out.println("0|2: " + tab2d[0][2]);
        System.out.println("1|1: " + tab2d[1][2]);
        System.out.println("2|1: " + tab2d[2][2]);

    }
}

class e1 {

    public e1() {
        System.out.println("Ej 1");
        int tamanio = 4;
        int i;
        int j;
        int val;
        int tab2d[][] = new int[tamanio][tamanio];
        val = 1;
        for (j = 0; j < tamanio; j++) {
            for (i = 0; i < tamanio; i++) {
                tab2d[i][j] = val;
                val++;
            }

        }
        System.out.println("0|0: " + tab2d[0][0]);
        System.out.println("1|0: " + tab2d[1][0]);
        System.out.println("2|0: " + tab2d[2][0]);
        System.out.println("3|0: " + tab2d[3][0]);
        System.out.println("0|1: " + tab2d[0][1]);
        System.out.println("1|1: " + tab2d[1][1]);
        System.out.println("2|1: " + tab2d[2][1]);
        System.out.println("3|1: " + tab2d[3][1]);
        System.out.println("0|2: " + tab2d[0][2]);
        System.out.println("1|1: " + tab2d[1][2]);
        System.out.println("2|1: " + tab2d[2][2]);
        System.out.println("3|1: " + tab2d[3][2]);
        System.out.println("0|3: " + tab2d[0][3]);
        System.out.println("1|3: " + tab2d[1][3]);
        System.out.println("2|3: " + tab2d[2][3]);
        System.out.println("3|3: " + tab2d[3][3]);
    }
}

class e2 {

    public e2() {
        System.out.println("Ejercicio 2");
        int tamanio = 4;
        int i;
        int j;
        int val = 0;
        int tab2d[][] = new int[tamanio][tamanio];
        for (j = 0; j < tamanio; j++) {
            for (i = 0; i < tamanio; i++) {
                if (i == j) {
                    tab2d[j][i] = 0;
                } else {
                    tab2d[j][i] = val;
                    tab2d[i][j] = val;
                }
            }
            val++;
        }

        System.out.println("0|0: " + tab2d[0][0]);
        System.out.println("1|0: " + tab2d[1][0]);
        System.out.println("2|0: " + tab2d[2][0]);
        System.out.println("3|0: " + tab2d[3][0]);
        System.out.println("0|1: " + tab2d[0][1]);
        System.out.println("1|1: " + tab2d[1][1]);
        System.out.println("2|1: " + tab2d[2][1]);
        System.out.println("3|1: " + tab2d[3][1]);
        System.out.println("0|2: " + tab2d[0][2]);
        System.out.println("1|1: " + tab2d[1][2]);
        System.out.println("2|1: " + tab2d[2][2]);
        System.out.println("3|1: " + tab2d[3][2]);
        System.out.println("0|3: " + tab2d[0][3]);
        System.out.println("1|3: " + tab2d[1][3]);
        System.out.println("2|3: " + tab2d[2][3]);
        System.out.println("3|3: " + tab2d[3][3]);

    }
}

