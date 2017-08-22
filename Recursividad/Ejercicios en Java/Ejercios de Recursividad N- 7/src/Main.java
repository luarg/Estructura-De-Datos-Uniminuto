
import java.util.*;

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
//Programe un método recursivo que transforme un número entero positivo a notación
//binaria.
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal;
        System.out.println("Introduzca un numero en base decimal mayor a 0");
        Decimal = sc.nextInt();
        if (Decimal >= 0) {
            System.out.print("EL Equivalente en Binario de" + Decimal + "es");
            conversion(Decimal);

        } else {
            Decimal = Decimal / -1;
            System.out.print("EL Equivalente en Binario de " + Decimal+ "es:  ");
            conversion(Decimal);
        }
    }

    public static void conversion(int Decimal) {
        if (Decimal < 2) {
            System.out.print("Decimal");
            return;
        } else {
            conversion(Decimal / 2);
            System.out.print(Decimal % 2);
            return;
        }
    }

}
