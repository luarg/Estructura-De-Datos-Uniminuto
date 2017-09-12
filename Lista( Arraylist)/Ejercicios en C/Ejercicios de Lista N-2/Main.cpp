/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Main.c++
 * Author: Michael Daniel Murillo López
 * Estrutura de Datos
 * ID:534830 Corporación
 * Universitaria Minuto de Dios - UNIMINUTO 
 * NRC:7273
 */
/*Escribir una función Reemplazar que tenga como argumentos una pila con tipo de elemento int y dos valores int:
 *nuevo y viejo de forma que si el segundo valor aparece en algún lugar de la pila, sea reemplazado por el segundo.  
 */
/*
*Programa que permite Insertar, Buscar, Modificar, Eliminar un elemento en una lista.
*/

#include <iostream>
#include <windows.h>
using namespace std;
#include "Lista.h"

Lista lst;
void Buscar(){ ///Procedimiento que permite buscar un elemento dentro de una lista.
    int i;
    cout << "Digite el valor a buscar " << endl;
    cin >> i;
    if(lst.Buscar(i)!=NULL){
        cout << "Se encontro el elemento " << i << endl;
    }else{
        cout << "No se encontro el elemento " << endl;
    }


}

void Modificar(){ ///Procedimiento que permite modificar un elemento dentro de una lista.
    int v, n;
    cout << "Digite el elemento de la lista que desea modificar" << endl;
    cin >> v;
    cout << "Digite el nuevo elemento " << endl;
    cin >> n;
    lst.Modificar(v,n);
}
void Eliminar(){ ///Procedimiento que permite eliminar un elemento de una lista.
    int n;
    cout << "Digite el valor que desea eliminar " << endl;
    cin >> n;
    lst.Eliminar(n);
}
int menu(){ ///Menu de opciones.
    system("color 0a");//cambio de color de pantalla
    int op;
    cout << "\n\t\tBIENVENIDO " << endl;
    cout << "1. Agregar Elemento a la Lista" << endl;
    cout << "2. Buscar Elemento en la lista " << endl;
    cout << "3. Modificar Elemento en la lista" << endl;
    cout << "4. Mostrar Lista de elementos agregados " << endl;
    cout << "5. Eliminar Elemento en la lista " << endl;
    cout << "6. Salir " << endl;
    cout << "Digite una opcion " << endl;
    cin >> op;
    return op;
}

int main()
{
    int opc, n;
    do{

    opc= menu();
    switch(opc){
    case 1:{
        ///Insertar elemento en una lista.
        cout << "Digite el elemento a insertar  en la lista " << endl;
        cin >>n;
        lst.Insertar(n);
    }break;
    case 2:{
        ///Buscar un elemento dentro de una lista.
        Buscar();
    }break;
    case 3:{
        ///Modificar un elemento dentro de una lista.
           Modificar();
    }break;
    case 4:{
        ///Mostrar todos los elementos dentro de una lista.
       lst.Mostrar();
    }break;
    case 5:{
        ///Eliminar un elemento dentro de una lista.
        //cout << "Digite el numero a eliminar : ";
        //cin >> n;
        //lst.Eliminar(n);
        Eliminar();
    }break;
    case 6:{
        ///Abandonar el programa.
    cout << "Saliendo del programa " << endl;
    }break;
    default:
        cout << "Opcion no programada " << endl;
    }
    system("pause");
    system("cls");
    }while(opc!=6);
    return 0;
}

