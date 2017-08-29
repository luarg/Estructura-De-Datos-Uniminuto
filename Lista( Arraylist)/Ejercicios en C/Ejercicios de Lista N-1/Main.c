/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Main.c
 * Author: Michael Daniel Murillo López
 * Estrutura de Datos
 * ID:534830 Corporación
 * Universitaria Minuto de Dios - UNIMINUTO 
 * NRC:7273
 * Created on 28 de agosto de 2017, 09:31 PM
 */
/*
 * Implementar una función que recibe una lista de enteros L 
 * y un número entero n de forma que modifique la lista mediante 
 * el borrado de todos los elementos de la lista que tengan este valor.  
 */
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define NUM_ELEM  23

int main(void) {
    int num[NUM_ELEM];
    int resto;
    int i;
    int j;
    int k;

    srand((unsigned) time(NULL));

    printf("Lista original:");
    for (i = 0; i < NUM_ELEM; i++) {
        num[i] = rand() % (NUM_ELEM / 2);
        printf("%3d", num[i]);
    }
    putchar('\n');

    resto = NUM_ELEM;
    for (i = 0; i < resto - 1; i++) {
        j = i + 1;
        while (j < resto) {
            if (num[j] != num[i])
                j++;
            else {
                for (k = j + 1; k < resto; k++)
                    num[k - 1] = num[k];
                resto--;
            }
        }
    }

    printf(" Sin repetidos:");
    for (i = 0; i < resto; i++) {
        printf("%3d", num[i]);
    }
    putchar('\n');

    return EXIT_SUCCESS;
}
