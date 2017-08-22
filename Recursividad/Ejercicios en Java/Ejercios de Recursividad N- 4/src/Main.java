
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo Lopez
 * Estrutura de Datos 
 * ID:534830
 * Corporación Universitaria Minuto de Dios - UNIMINUTO
 * NRC 7273
 */
//Escribir una función recursiva que devuelva la suma de los primeros N enteros



public class Main {

    public static void main(String[] args) throws IOException {

        int n;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Introduzca numero n:");
            n = Integer.parseInt(entrada.readLine());
        } while (n < 0);
        System.out.println("La suma de los numeros es:" + n + ": " + suma(n));
    }

    static long suma(int n) {
        if (n <= 1) {
            return 1;
        } else {
            long resultado = n + suma(n - 1);
            return resultado;
        }

    }
}

