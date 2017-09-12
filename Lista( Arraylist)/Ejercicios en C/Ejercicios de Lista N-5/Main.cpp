/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Main.c++
 * Author: Michael Daniel Murillo López
 * Estrutura de Datos
 * ID:534830 
 * Corporación Universitaria Minuto de Dios - UNIMINUTO 
 * NRC:7273
 */
/*Construir una función que sume los elementos de una lista de enteros recursivamente.
 */
#include <cstdio>
#include <cstdlib>
#include <iostream>
/**
Suma con una funcion recursiva

**/
 
using namespace std;
int sumar(int[],int);
int main(int argc, char *argv[])
{
    int *arreglo;
    int resultado=0;
    int tamano=0;
    system("color 0c");//cambio de color de pantalla
 
 
    printf("Programa que Suma con una Funcion Recursiva\n\n\n");
    printf("Ingrese el tamano del arreglo:  ");
    scanf("%i",&tamano);
 
    arreglo = new int[tamano];
 
    for(int i=0;i<tamano;i++){
 
    printf("Ingrese el elemento Numero %i :",i+1);
    scanf("%i",&arreglo[i]);
 
    }
 
    resultado = sumar(arreglo,tamano);
    printf("\nEl Resultado de la Suma es: %i",resultado);
    printf("\n");
    printf("\n");
    printf("\n");
    return EXIT_SUCCESS;
}
 
//Esta es la funcion recursiva de suma
int sumar(int a[],int n)
{
    if(n==1)
    {
        return a[0];
    }else{
        return a[n-1]+sumar(a,n-1);
    }
}


