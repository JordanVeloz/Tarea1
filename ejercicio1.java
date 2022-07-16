/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUltimos;

import java.util.Scanner;

public class ejercicio1 {

    
    public static void main(String[] args) {
        //Ejercicio 2.
        //Entrada
        int edad = 0;
        double promedio = 0;
        int contador = 0;
        double suma = 0;

        System.out.println("ingrese una edad: ");
        edad = input.nextInt();
        suma += solicitar(edad);
        while (edad != 0) {
            System.out.println("ingrese una edad: ");
            edad = input.nextInt();
            suma += solicitar(edad);
            if (edad > 18) {
                contador++;
            }
            System.out.println("Digite 0 para finalizar...");
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
    }

    public static double solicitar(int edad) {
        if (edad > 18) {
            return edad;
        } else {
            return 0;
        }
    }
    
}
