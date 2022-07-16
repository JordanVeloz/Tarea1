/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Ejercicio 8.
/*Dado un (1) número, imprimir Positivo o Negativo según sea el
numero.*/
//Entrada
        Scanner escaner = new Scanner(System.in);
//Proceso
        System.out.println("Ingrese un número:");
        double numero = escaner.nextDouble();
        if (numero < 0) {
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El número ingresado es negativo");
        }

    }

}
