/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import logica.Dado;

/**
 *
 * @author Estudiantes
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = new int[1000], conteo[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int numero;
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int i = 0; i < 1000; i++) {
            numero = dado1.lanzarDado() + dado2.lanzarDado();
            A[i] = numero;
        }

        for (int i = 0; i < 1000; i++) {
            if (A[i] == 2) {
                conteo[0]++;
            } else if (A[i] == 3) {
                conteo[1]++;
            } else if (A[i] == 4) {
                conteo[2]++;
            } else if (A[i] == 5) {
                conteo[3]++;
            } else if (A[i] == 6) {
                conteo[4]++;
            } else if (A[i] == 7) {
                conteo[5]++;
            } else if (A[i] == 8) {
                conteo[6]++;
            } else if (A[i] == 9) {
                conteo[7]++;
            } else if (A[i] == 10) {
                conteo[8]++;
            } else if (A[i] == 11) {
                conteo[9]++;
            } else if (A[i] == 12) {
                conteo[10]++;
            }
        }
       
        for (int i = 0; i < 11; i++) {
            System.out.println("Frecuencia " + (i + 2) + ": " + conteo[i] );
        }

    }

}
