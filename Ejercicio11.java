/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /*Ejercicio 11.
Dado un (1) número de cuatro (4) dígitos imprimirlo por separado en unidades,
decenas, centenas y unidades de mil.
Entrada:
1234
Salida:
Unidades: 4
Decenas: 3
Centenas: 2
Unidades de mil: 1*/
        //Entrada
        int numero = 0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero: \n");
        numero = escaner.nextInt();
//Proceso
        int millares = numero / 1000;
        int centenas = (numero - (millares * 1000)) / 100;
        int decenas = (numero - (millares * 1000 + centenas * 100)) / 10;
        int unidades = numero - (millares * 1000 + centenas * 100 + decenas * 10);
//Salida
        System.out.println("Millares = " + millares);
        System.out.println("Centenas = " + centenas);
        System.out.println("Decenas = " + decenas);
        System.out.println("Unidades = " + unidades);
    }

}
