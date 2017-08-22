/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelDaniel Murillo Lopez
 * Estrutura de Datos
 * ID:534830 Corporación
 * Universitaria Minuto de Dios - UNIMINUTO
 * NRC:7273
 */
/*
Cuál es el resultado de esta función para distintos valores de X?
Static int f(int x)
{
if (x >100)
{
return (x-10);
}
else
{
return(f(f(x+11)));
}
}
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("el Resultado de X es:" + f(0));

    }

    public static int f(int x) {
        if (x > 100) {
            return (x - 10);
        } else {
            return (f(f(x + 11)));

        }
    }

}
