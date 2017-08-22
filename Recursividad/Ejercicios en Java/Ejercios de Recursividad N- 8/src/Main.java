
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael Daniel Murillo Lopez Estrutura de Datos ID:534830 Corporación
 * Universitaria Minuto de Dios - UNIMINUTO NRC 7273
 */
//Programe un método recursivo que transforme un número expresado en notación binaria
//a un número entero.
public class Main {

    
    public static int D = 0;
    public static void main(String[] args) {
        String entrada = "01010";
        int Binario = Integer.parseInt(entrada);
        int orden = (entrada.length() - 1);
        if (Binario >= 0) {
            System.out.println();
            conversion(Binario, orden);
            System.out.println("El equivalente de Decimal del numero binario    " + Binario + "  es:" + D);

        } else {
            Binario = (Binario / -1);
            orden = orden - 1;
            System.out.println();

            conversion(Binario, orden);
            System.out.println("El equivalente en decimal de numero binario     " + Binario + "   es;" + D);

        }

    }

    public static void conversion(int Binario, int orden) {
        if (Binario < 10) {
            int operacion = (Binario % 2) * (int) Math.pow(2, orden);
            D = D + operacion;
            return;
        } else {
            conversion(Binario / 10, orden - 1);
            int operacion = (Binario % 2) * (int) Math.pow(2, orden);
            D = D + operacion;
            return;
        }

    }

}
