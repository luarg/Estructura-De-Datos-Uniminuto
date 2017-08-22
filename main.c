/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Factorial recursibo.c
 * Author: Michael Daniel Murillo López 
 * ID: 534830
 * NRC:7273 
 *
 * Created on 15 de agosto de 2017, 8:23 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int factorial(int n) {
    int r;
    if (n == 1) {
        return 1;
    }
    r = n * factorial(n - 1);
    return (r);
}

int main() {
    int n, res;
    printf("***********************************\n");
    printf("       Factorial Recursivon        \n");
    printf("***********************************\n");
    printf("ingrese un numero: ");
    scanf("%d", &n);
   while (n < 0) {

        printf("Ingrese un numero positivo\n"); 
        return main();

    }
    res = factorial(n);
    printf("El factorial de %d es: %d", n, res);
    return 0;
}

