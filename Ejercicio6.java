/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnceEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        /* Ejercicio 6.
Dados dos (2) lados de un triángulo en cm, calcular la hipotenusa del mismo.*/
        //Entrada
        Scanner input = new Scanner(System.in);
        //Proceso
        System.out.print("Ingrese el valor del cateto A: ");
        double A = input.nextDouble();
        System.out.print("Ingese el valor del cateto B: ");
        double B = input.nextDouble();

        A = Math.pow(A, 2);
        B = Math.pow(B, 2);

        double c = Math.sqrt(A + B);
//Salida
        System.out.println("------------------");
        System.out.println("El Valor de la Hipotenusa es: " + c);
    }

}
