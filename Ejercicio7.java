/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Ejercicio 7.
/*Dado un (1) número, imprimir 0 si es par y 1 si es impar.*/
//Entrada
        int numero;
        Scanner teclado = new Scanner(System.in);
//Proceso
        System.out.printf("Introduzca un número entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("El numero ingresado es par");
        } else {
            System.out.printf("El numero ingresado es impar");
        }
    }

}
