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
//Implemente una función recursiva que nos diga si una cadena es palíndromo.
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String sPalabra = "anilina ";
        String sPalabra = "Paula es Inteligente";

        sPalabra = sPalabra.replace(" ", ""); // Si queremos saber si es palíndromo una frase   // deberemos de borrar los espacios
        int inc = 0;
        int des = sPalabra.length() - 1;
        boolean bError = false;

        while ((inc < des) && (!bError)) {

            if (sPalabra.charAt(inc) == sPalabra.charAt(des)) {
                inc++;
                des--;
            } else {
                bError = true;
            }
        }

        if (!bError) {
            System.out.println(sPalabra + " es un PALINDROMO");
        } else {
            System.out.println(sPalabra + " NO es un palindromo");
        }

    }
}
