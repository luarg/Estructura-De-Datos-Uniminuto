/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Main.c
 * Author: Michael Daniel Murillo López 
 * Id: 534830
 * Estrutura de Datos
 * ID:534830 
 * Corporación Universitaria Minuto de Dios - UNIMINUTO 
 * NRC:7273
 *
 * Created on 18 de agosto de 2017, 11:22 AM
 */

/*Escriba una definición recursiva de una función que tiene un parámetro n de tipo entero y 
que devuelve el n-ésimo número de Fibonacci.
Los números de Fibonacci se definen de la siguiente manera:

F0 = 1

F1 = 1

Fi+2 = Fi + Fi+1
 */




/* fib.c - generate Fibonacci numberos. */

#include <stdio.h>
#include <stdlib.h>
/* Fib (101) es demasiado grande para sin firmar largo tiempo en mi máquina. */
#define SIZE 101//

/* Uso de una matriz global para almacenar las fibs.
 * Debe inicializarse a cero para que la función funcione. 
 */
unsigned long long int Fibonacci[SIZE] = {0, 1};

unsigned long long int fib(int n);

int main(void) {
    int i, len = SIZE;

    fib(SIZE - 1);

    /* Muestra los números. */
    for (i = 0; i < len; i++)
        printf("Fib %d es %llu.\n", i, Fibonacci[i]);

    return 0;
}

/* Función recursiva. Evita demasiado trabajo al comprobar
 * Para las fibonaccci ya calculadas. 
 */
unsigned long long int fib(int n) {
    if (n < 2)
        return n;
    if (Fibonacci[n])
        return Fibonacci[n];
    Fibonacci[n] = fib(n - 1) + fib(n - 2);
    return Fibonacci[n];
}



