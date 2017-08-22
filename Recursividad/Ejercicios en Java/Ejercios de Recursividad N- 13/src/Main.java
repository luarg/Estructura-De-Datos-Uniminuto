
import java.util.Scanner;
import java.io.InputStream;

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
//Diseñe e implemente un algoritmo que imprima todas las posibles descomposiciones de
//un número natural como suma de números menores que él.
//1= 1
//2 = 1+1
//3= 2 + 1
//3= 1+1+1
//4= 3+1
//4= 2+1+1
//4 = 1+1+1+1
//4=2+2
//4=2+1+1
//4=1+1+1+1
//N = (n-1) +1
//N = (n-2) + 2 = (n-2) + 1 + 1
public class Main {

    public String descomposicion(int n) {
        int i = 1;
        if (n == 1) {
            return "1";
        } else {
            if (n > n - 2) {
                return "1+" + descomposicion(n - 1);
            }
        }
        return "1+" + descomposicion(n - 1);
    }
    public String descomposicion2(int n) {
        int i = 1;
        if (n == 1) {
            return "1";
        } else {
            if (n > n - 1) {
                return "2+" + descomposicion(n - 2);
            }
        }
        return "1+" + descomposicion(n - 1);
    }
    public String descomposicion3(int n) {
        int i = 1;
        if (n == 1) {
            return "1";
        } else {
            if (n > n - 2) {
                return "3+" + descomposicion(n - 2);
            }
        }
        return "1+" + descomposicion(n - 1);
    }
    public String descomposicion4(int n) {
        int i = 2;
        if (n == 4) {
            return "2+2";
        } else {
            if (n > n - 2) {
                return "2+" + descomposicion(n - 1);
            }
        }
        return "2+" + descomposicion(n - 1);
    }

    public static void main(String[] ar) {

        Main re = new Main();
        
        System.out.println( "--------------------------------");
        System.out.print("Descomposicion:\nA:   "+re.descomposicion(4));
        System.out.print("\nB:   "+re.descomposicion2(4));
        System.out.print("\nC:   "+re.descomposicion4(4));
        System.out.print("\nD:   "+re.descomposicion3(4-1));
        System.out.println( "\n--------------------------------");
        
       

    }
}
