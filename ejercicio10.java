/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        /*Ejercicio 10.
Dados N número positivos (N>1) calcular el promedio de esta serie. Considere que
la serie termina al leer un 0.*/
        Scanner input = new Scanner(System.in);
        int n = 0;
        double p = 0;
        int c = 0, s = 0;
        System.out.println("Ingrese un numero: ");
        n = input.nextInt();
        s = s + n;
        while (n != 0) {
            System.out.println("Ingrese un numero: ");
            n = input.nextInt();
            c++;
            s = s + n;
        }
        p = s / c;
        System.out.println("El promedio es: " + p);
    }

}
