
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MichaelDaniel Murillo Lopez 
 * Estrutura de Datos 
 * ID:534830
 * Corporación Universitaria Minuto de Dios - UNIMINUTO 
 * NRC:7273
 */
//Programe un método recursivo que calcule la suma de un arreglo de números enteros.
public class Main {

    static Scanner entrada = new Scanner(System.in);

    static int SumaRecursivaDatosArreglo(int[] arr, int n) {
        if (n == 0) {
            return arr[n];

        } else {
            return arr[n] + SumaRecursivaDatosArreglo(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Por Favor Ingresar el Valor de N;");
        n = entrada.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=(int)(Math.random()*1001);
            System.out.println(arr[i]+"\t");
        }
        System.out.println("La Suma de los datos del Arreglo  es: " +SumaRecursivaDatosArreglo(arr, n-1));
    }

}
